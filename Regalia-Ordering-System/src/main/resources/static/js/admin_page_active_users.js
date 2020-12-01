function setUserCwid(user){
    let username = user
    let ModalUsername = document.getElementById("modelCwidValue");
    ModalUsername.attribute = username;
    ModalUsername.textContent = username;
}

function postDeleteUser(){
    const route = 'https://regalia.capping.ecrl.marist.edu/user/delete/';
    let id = document.getElementById("modelCwidValue").textContent;
    let url = route + id ;


    // request options
    const options = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        }
    }

    // send POST request
    fetch(url, options)
        .then(res => res.json())
        .then(res => console.log(res));


    window.location.href = "/admin_page_active_users"
}

function getUserByCwid(cwid){

        const url = 'https://regalia.capping.ecrl.marist.edu/user/';

        let usersCwid = cwid;

        let fetchUrl = url + usersCwid;



        let firstName = document.getElementById("firstName");
        let lastName = document.getElementById("lastName");
        let email = document.getElementById("email");
        let phoneNumber = document.getElementById("phoneNumber");
        let department = document.getElementById("department");
        let capSize = document.getElementById("capSize");
        let degree = document.getElementById("degree");
        let weight = document.getElementById("weight");
        let height = document.getElementById("height");
        let grantingInstitution = document.getElementById("grantingInstitution");
        let institutionState = document.getElementById("institutionState");
        let institutionCity = document.getElementById("institutionCity");
        let ceremonyDate = document.getElementById("ceremonyDate");
        let role = document.getElementById("role");
        let username = document.getElementById("cwid");

        fetch(fetchUrl)
            .then(response => response.json())
            .then(json => {


                firstName.value = json.first_name;
                lastName.value = json.last_name;
                email.value = json.email;
                phoneNumber.value = json.phone_number;
                department.value = json.department;
                capSize.value = json.cap_size;
                degree.value = json.degree;
                weight.value = json.weight;
                height.value = json.height;
                grantingInstitution.value = json.granting_institution;
                institutionState.value = json.granting_state;
                institutionCity.value = json.granting_city;
                ceremonyDate.value = json.ceremony_date;
                username.value = json.username;
                role.value = json.role;
                console.log(json)

            })


}

function updateUser(){

    //Api Requirements
    const url = 'https://regalia.capping.ecrl.marist.edu/user/edit/';

    let usersCwid = document.getElementById("cwid").value;

    let fetchUrl = url + usersCwid;

    //Build New user object for post request
    let firstNameDOM = document.getElementById("firstName");
    let lastNameDOM = document.getElementById("lastName");
    let emailDOM = document.getElementById("email");
    let phoneNumberDOM = document.getElementById("phoneNumber");
    let departmentDOM = document.getElementById("department");
    let capSizeDOM = document.getElementById("capSize");
    let degreeDOM = document.getElementById("degree");
    let weightDOM = document.getElementById("weight");
    let heightDOM = document.getElementById("height");
    let grantingInstitutionDOM = document.getElementById("grantingInstitution");
    let institutionStateDOM = document.getElementById("institutionState");
    let institutionCityDOM = document.getElementById("institutionCity");
    let ceremonyDateDOM = document.getElementById("ceremonyDate");
    let roleDOM = document.getElementById("role");


    const user = {
           first_name : firstNameDOM.value,
           last_name : lastNameDOM.value,
           email : emailDOM.value,
           phone_number : phoneNumberDOM.value,
           department : departmentDOM.value,
           cap_size : capSizeDOM.value,
           degree : degreeDOM.value,
           weight : weightDOM.value,
           height : heightDOM.value,
           granting_institution : grantingInstitutionDOM.value,
           granting_state : institutionStateDOM.value,
           granting_city : institutionCityDOM.value,
           ceremony_date : ceremonyDateDOM.value,
           role : roleDOM.value,
           username: usersCwid
       };

       console.log(user);

       // request options
       const options = {
       method: 'POST',
       body: JSON.stringify(user),
       headers: {
           'Content-Type': 'application/json'
           }
       }

       // send POST request
       fetch(fetchUrl, options)
       .then(res => res)
       .then(result => {
         console.log('Success:', result);
       })
       .catch(error => {
         console.error('Error:', error);
       });

       window.location.href = "/admin_page_active_users"


}

function createNewUser() {

    // Api Requirements
    const route = 'https://regalia.capping.ecrl.marist.edu/user/add';
    let url = route;

    let firstNameDOM = document.getElementById("newFirstName");
    let lastNameDOM = document.getElementById("newLastName");
    let emailDOM = document.getElementById("newEmail");
    let phoneNumberDOM = document.getElementById("newPhoneNumber");
    let departmentDOM = document.getElementById("newDepartment");
    let capSizeDOM = document.getElementById("newCapSize");
    let degreeDOM = document.getElementById("newDegree");
    let weightDOM = document.getElementById("newWeight");
    let heightDOM = document.getElementById("newHeight");
    let grantingInstitutionDOM = document.getElementById("newGrantingInstitution");
    let institutionStateDOM = document.getElementById("newInstitutionState");
    let institutionCityDOM = document.getElementById("newInstitutionCity");
    let ceremonyDateDOM = document.getElementById("newCeremonyDate");
    let roleDOM = document.getElementById("newRole");
    let usernameDOM = document.getElementById("newCwid");



    function validUserData(){

            //Regular Expression For Client Side Validation
            let nameFormat = /^([a-zA-Z]{2,})$/
            let nameSpaceFormat = /^[a-zA-Z-,]+(\s{0,1}[a-zA-Z-, ])*$/
            let emailFormat = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
            let phoneNumberFormat = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;

            //Variables Used for testing each field
            let firstNameTest = nameFormat.test(firstNameDOM.value);
            let lastNameTest = nameFormat.test(lastNameDOM.value);
            let phoneNumberTest = phoneNumberFormat.test(phoneNumberDOM.value);
            let departmentTest = departmentDOM.value != '';
            let capSizeTest = capSizeDOM.value != '';
            let degreeTest = degreeDOM.value != '';
            let grantInstTest = nameSpaceFormat.test(grantingInstitutionDOM.value);
            let grantStateTest = institutionStateDOM.value != '';
            let grantCityTest = nameSpaceFormat.test(institutionCityDOM.value);
            let ceremonyTest = ceremonyDateDOM.value != '';
            let heightTest = heightDOM.value != '';
            let roleTest = roleDOM.value != '';
            let emailTest = emailDOM.value != '';
            let userNameTest = usernameDOM.value != '';

            //Ugly If statement to check each test case
            if(firstNameTest == true && lastNameTest == true && emailTest == true && phoneNumberTest == true &&
                departmentTest == true && capSizeTest == true && degreeTest == true && heightTest == true && roleTest == true &&
                weightDOM.value > 50 && weightDOM.value < 400 && grantInstTest == true && grantStateTest == true && grantCityTest == true &&  ceremonyTest == true &&
                emailTest == true && userNameTest == true){

                    const user = {
                                    first_name : firstNameDOM.value,
                                    last_name : lastNameDOM.value,
                                    email : emailDOM.value,
                                    phone_number : phoneNumberDOM.value,
                                    department : departmentDOM.value,
                                    cap_size : capSizeDOM.value,
                                    degree : degreeDOM.value,
                                    weight : weightDOM.value,
                                    height : heightDOM.value,
                                    granting_institution : grantingInstitutionDOM.value,
                                    granting_state : institutionStateDOM.value,
                                    granting_city : institutionCityDOM.value,
                                    ceremony_date : ceremonyDateDOM.value,
                                    role : roleDOM.value,
                                    username: usernameDOM.value
                                };

                                console.log(user);

                    // request options
                    const options = {
                        method: 'POST',
                        body: JSON.stringify(user),
                        headers: {
                            'Content-Type': 'application/json'
                        }
                    }

                    // send POST request
                    fetch(url, options)
                        .then(res => res)
                        .then(res => console.log(res));

                    window.location.href = "/admin_page_active_users"

            }else{
                //Ugly if statement to update the errors on the DOM
                if(firstNameTest == false){
                    firstNameDOM.focus();
                    firstNameDOM.blur();
                }

                if(lastNameTest == false){
                    lastNameDOM.focus();
                    lastNameDOM.blur();
                }

                if(phoneNumberTest == false){
                    phoneNumberDOM.focus();
                    phoneNumberDOM.blur();
                }

                if(departmentTest == false){
                    departmentDOM.focus();
                    departmentDOM.blur();
                }

                if(capSizeTest == false){
                    capSizeDOM.focus();
                    capSizeDOM.blur();
                }

                if(degreeTest == false){
                    degreeDOM.focus();
                    degreeDOM.blur();
                }

                if(heightTest == false){
                    heightDOM.focus();
                    heightDOM.blur();
                }

                if(weightDOM.value < 50 || weightDOM.value > 400){
                    weightDOM.focus();
                    weightDOM.blur();
                }

                if(grantInstTest == false){
                    grantingInstitutionDOM.focus();
                    grantingInstitutionDOM.blur();
                }

                if(grantStateTest == false){
                    institutionStateDOM.focus();
                    institutionStateDOM.blur();
                }

                if(grantCityTest == false){
                    institutionCityDOM.focus();
                    institutionCityDOM.blur();
                }

                if(ceremonyTest == false){
                    ceremonyDateDOM.focus();
                    ceremonyDateDOM.blur();
                }

                if(roleTest == false){
                    roleDOM.focus();
                    roleDOM.blur();
                }

                if(emailTest == false){
                    emailDOM.focus();
                    emailDOM.blur();
                    newEmailTaken.style.display = "none";
                }

                if(userNameTest == false){
                    usernameDOM.focus();
                    usernameDOM.blur();
                    newCwidTaken.style.display = "none";
                }
            }

        }

        validUserData();

}

//Method to check if a field if valid when the user clicks a field
(function() {
  'use strict';
  window.addEventListener('load', function() {


    // Get the email field
    let email = document.getElementById('email');

    // Email taken div
    let emailTaken = document.getElementById('emailTaken')
    // Email format div
    let emailFormat = document.getElementById('emailFormat')

    // Submit Button
    let submit = document.getElementById("edit-submit");


    // Init a timeout variable to be used below
    let timeout = null;

    let emailValid = true;

    // Variable used to store a ref to users stored email value
    let usersStoredEmail = null;

   // Listen for keystroke events
       email.addEventListener('keyup', function (e) {
         // Clear the timeout if it has already been set.
         // This will prevent the previous task from executing
         // if it has been less than <MILLISECONDS>
         clearTimeout(timeout);

         // Make a new timeout set to go off in 1000ms (1 second)
         timeout = setTimeout(function () {
            const emailValidUrl = 'https://regalia.capping.ecrl.marist.edu/user/check/email/';
            let username = document.getElementById("cwid").value;
            let emailFetchUrl = emailValidUrl + username;


            fetch(emailFetchUrl)
                .then(response => response.json())
                .then(data => {
                    localStorage.setItem('email', data.email)
                })
                .then(() => console.log(usersStoredEmail))

             let usersStoredEmail = localStorage.getItem('email');
             const url = 'https://regalia.capping.ecrl.marist.edu/user/email/'
             let userEmail = document.getElementById("email").value;
             let fetchUrl = url + userEmail;

             fetch(fetchUrl)
               .then(response => response.json())
               .then(emailIsTaken => {
                   if(emailIsTaken == true){
                       if(userEmail == usersStoredEmail){
                            emailTaken.style.display = "none";
                            emailFormat.style.display = "none";
                            email.classList.remove('is-invalid')
                            email.classList.add('is-valid');
                            emailValid = true;
                             if(emailValid == false){
                                submit.disabled = true;
                             }else{
                                submit.disabled = false;
                             }
                        }else{

                           emailFormat.style.display = "none";
                           emailTaken.style.display = "block";
                           email.classList.remove('is-valid');
                           email.classList.add('is-invalid');
                           submit.disabled = true;
                           emailValid = false;
                        }
                   }else{
                       if(email.checkValidity() === true){
                           emailTaken.style.display = "none";
                           emailFormat.style.display = "none";
                           email.classList.remove('is-invalid')
                           email.classList.add('is-valid');
                           emailValid = true;
                            if(emailValid == false){
                               submit.disabled = true;
                            }else{
                               submit.disabled = false;
                            }

                       }else if(email.checkValidity() === false){
                           email.classList.remove('is-valid');
                           email.classList.add('is-invalid');
                           emailTaken.style.display = "none";
                           emailFormat.style.display = "none";
                           submit.disabled = true
                           emailValid = false;
                       }

                       if(email.value == ''){
                           emailFormat.style.display = "block";
                           emailTaken.style.display = "none";
                           email.classList.remove('is-valid');
                           email.classList.add('is-invalid');
                           emailValid = false

                       }
                   }
               });
         }, 50);
       });


    // fetch all the forms we want to apply custom style
    var inputs = document.getElementsByClassName('validateForm')


    // loop over each input and watch blur event
    var clearWhenTyping = Array.prototype.filter.call(inputs, function(input) {

      //gets rid of error message if a user types in a field
      input.addEventListener('keydown', function(event) {

        // reset
        input.classList.remove('is-invalid')
        input.classList.remove('is-valid')
      }, false);
    });


    // loop over each input and watch blur event
    var validation = Array.prototype.filter.call(inputs, function(input) {

      input.addEventListener('blur', function(event) {
        // reset
        input.classList.remove('is-invalid')
        input.classList.remove('is-valid')

        if (input.checkValidity() === false) {
            input.classList.add('is-invalid')
            submit.disabled = true;
        }
        else {
            input.classList.add('is-valid')
            if(emailValid == false ){
                submit.disabled = true;
            }else{
                submit.disabled = false;
            }
        }
      }, false);
    });
  }, false);
})()

// A function to format text to look like a phone number
function phoneFormat(input){
        // Strip all characters from the input except digits
        input = input.replace(/\D/g,'');

        // Trim the remaining input to ten characters, to preserve phone number format
        input = input.substring(0,10);

        // Based upon the length of the string, we add formatting as necessary
        var size = input.length;
        if(size == 0){
                input = input;
        }else if(size < 4){
                input = '('+input;
        }else if(size < 7){
                input = '('+input.substring(0,3)+') '+input.substring(3,6);
        }else{
                input = '('+input.substring(0,3)+') '+input.substring(3,6)+'-'+input.substring(6,10);
        }
        return input;
}

window.onload=function(){

    let cwid = document.getElementById("newCwidTaken");
    cwid.style.display = "none";

    document.getElementById('phoneNumber').addEventListener('keyup',function(evt){
            var phoneNumber = document.getElementById('phoneNumber');
            var charCode = (evt.which) ? evt.which : evt.keyCode;
            phoneNumber.value = phoneFormat(phoneNumber.value);
    });


    document.getElementById('newPhoneNumber').addEventListener('keyup',function(evt){
            var phoneNumber = document.getElementById('newPhoneNumber');
            var charCode = (evt.which) ? evt.which : evt.keyCode;
            phoneNumber.value = phoneFormat(phoneNumber.value);
    });
}

