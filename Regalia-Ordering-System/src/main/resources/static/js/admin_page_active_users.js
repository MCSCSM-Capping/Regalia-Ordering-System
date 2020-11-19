
function setUserCwid(user){
    let username = user
    let ModalUsername = document.getElementById("modelCwidValue");
    ModalUsername.attribute = username;
    ModalUsername.textContent = username;
}

function postDeleteUser(){
    const route = 'http://localhost:8080/user/delete/';
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

        const url = 'http://localhost:8080/user/';

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
    const url = 'http://localhost:8080/user/edit/';

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
    const route = 'http://localhost:8080/user/add';
    let url = route;

    let firstNameDOM = document.getElementById("newFirstName").value;
    let lastNameDOM = document.getElementById("newLastName").value;
    let emailDOM = document.getElementById("newEmail").value;
    let phoneNumberDOM = document.getElementById("newPhoneNumber").value;
    let departmentDOM = document.getElementById("newDepartment").value;
    let capSizeDOM = document.getElementById("newCapSize").value;
    let degreeDOM = document.getElementById("newDegree").value;
    let weightDOM = document.getElementById("newWeight").value;
    let heightDOM = document.getElementById("newHeight").value;
    let grantingInstitutionDOM = document.getElementById("newGrantingInstitution").value;
    let institutionStateDOM = document.getElementById("newInstitutionState").value;
    let institutionCityDOM = document.getElementById("newInstitutionCity").value;
    let ceremonyDateDOM = document.getElementById("newCeremonyDate").value;
    let roleDOM = document.getElementById("newRole").value;
    let usernameDOM = document.getElementById("newCwid").value;


    const user = {
        first_name : firstNameDOM,
        last_name : lastNameDOM,
        email : emailDOM,
        phone_number : phoneNumberDOM,
        department : departmentDOM,
        cap_size : capSizeDOM,
        degree : degreeDOM,
        weight : weightDOM,
        height : heightDOM,
        granting_institution : grantingInstitutionDOM,
        granting_state : institutionStateDOM,
        granting_city : institutionCityDOM,
        ceremony_date : ceremonyDateDOM,
        role : roleDOM,
        username: usernameDOM
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
        .then(res => res.json())
        .then(res => console.log(res));


    window.location.href = "/admin_page_active_users"

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

    // Listen for keystroke events
    email.addEventListener('keyup', function (e) {
      // Clear the timeout if it has already been set.
      // This will prevent the previous task from executing
      // if it has been less than <MILLISECONDS>
      clearTimeout(timeout);

      // Make a new timeout set to go off in 1000ms (1 second)
      timeout = setTimeout(function () {
          const url = 'http://localhost:8080/user/email/'
          let userEmail = email.value;
          let fetchUrl = url + userEmail;

          fetch(fetchUrl)
            .then(response => response.json())
            .then(emailIsTaken => {
                if(emailIsTaken == true){
                    emailFormat.style.display = "none";
                    emailTaken.style.display = "block";
                    email.classList.remove('is-valid');
                    email.classList.add('is-invalid');
                    submit.disabled = true

                }else{
                    if(email.checkValidity() === true){
                        emailTaken.style.display = "none";
                        emailFormat.style.display = "none";
                        email.classList.remove('is-invalid')
                        email.classList.add('is-valid');
                    }else if(email.checkValidity() === false){
                        email.classList.remove('is-valid');
                        email.classList.add('is-invalid');
                        emailTaken.style.display = "none";
                        emailFormat.style.display = "none";
                        submit.disabled = true
                    }

                    if(email.value == ''){
                        emailFormat.style.display = "block";
                        emailTaken.style.display = "none";
                        email.classList.remove('is-valid');
                        email.classList.add('is-invalid');
                        console.log("empty test")
                    }
                }
            });
      }, 1000);
    });


    // fetch all the forms we want to apply custom style
    var inputs = document.getElementsByClassName('edit-user-form')


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
            submit.disabled = false;
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
    document.getElementById('phoneNumber').addEventListener('keyup',function(evt){
            var phoneNumber = document.getElementById('phoneNumber');
            var charCode = (evt.which) ? evt.which : evt.keyCode;
            phoneNumber.value = phoneFormat(phoneNumber.value);
    });
}

