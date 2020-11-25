////Function to get all of the form data a place it in the modal
function getModalData(){

    //Getting form data and storing it in block scope variables
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
    let formSubmit = document.getElementById("formSubmit");

    //Getting modal element by id
    let FirstName = document.getElementById("FirstName");
    let LastName = document.getElementById("LastName");
    let Email = document.getElementById("Email");
    let PhoneNumber = document.getElementById("PhoneNumber");
    let Department = document.getElementById("Department");
    let CapSize = document.getElementById("CapSize");
    let Degree = document.getElementById("Degree");
    let Weight = document.getElementById("Weight");
    let Height = document.getElementById("Height");
    let GrantingInstitution = document.getElementById("GrantingInstitution");
    let InstitutionState = document.getElementById("InstitutionState");
    let InstitutionCity = document.getElementById("InstitutionCity");
    let CeremonyDate = document.getElementById("CeremonyDate");

    //A dirty method to parse the height value to correct format
    console.log(height.value);
    if(height.value.length == 3){
            var feet = height.value.slice(0,1)
            var inches = height.value.slice(2)
            var height_feet_inches = feet + "'" + inches +'"';

            Height.textContent = height_feet_inches;

        }else{
            var feet = height.value.slice(0,1)
            var inches = height.value.slice(2,3)
            var height_feet_inches = feet + "'" + inches +'"';

            Height.textContent = height_feet_inches;
        }

    //Setting the Modal Data with the form Data
    FirstName.textContent = firstName.value;
    LastName.textContent = lastName.value;
    Email.textContent = email.value;
    PhoneNumber.textContent = phoneNumber.value;
    Department.textContent = department.value;
    CapSize.textContent = capSize.value;
    Degree.textContent = degree.value;
    Weight.textContent = weight.value;
    GrantingInstitution.textContent = grantingInstitution.value;
    InstitutionState.textContent = institutionState.value;
    InstitutionCity.textContent = institutionCity.value;
    CeremonyDate.textContent = ceremonyDate.value;

    function validUserData(){

        //Regular Expression For Client Side Validation
        let nameFormat = /^([a-zA-Z]{2,})$/
        let nameSpaceFormat = /^[a-zA-Z-,]+(\s{0,1}[a-zA-Z-, ])*$/
        let emailFormat = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
        let phoneNumberFormat = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;

        //Variables Used for testing each field
        let firstNameTest = nameFormat.test(firstName.value);
        let lastNameTest = nameFormat.test(lastName.value)
        let emailTest = emailFormat.test(email.value)
        let phoneNumberTest = phoneNumberFormat.test(phoneNumber.value)
        let departmentTest = department.value != ''
        let capSizeTest = capSize.value != ''
        let degreeTest = degree.value != ''
        let grantInstTest = nameSpaceFormat.test(grantingInstitution.value)
        let grantStateTest = institutionState.value != ''
        let grantCityTest = nameSpaceFormat.test(institutionCity.value)
        let ceremonyTest = ceremonyDate.value != ''
        let heightTest = height.value != ''

        //Ugly If statement to check each test case
        if(firstNameTest == true && lastNameTest == true && emailTest == true && phoneNumberTest == true &&
            departmentTest == true && capSizeTest == true && degreeTest == true && heightTest == true &&
            weight.value > 50 && weight.value < 400 && grantInstTest == true && grantStateTest == true && grantCityTest == true &&  ceremonyTest == true){

                $("#previewOrderForm").modal();

        }else{
            //Ugly if statement to update the errors on the DOM
            if(firstNameTest == false){
                firstName.focus();
                firstName.blur();
            }

            if(lastNameTest == false){
                lastName.focus();
                lastName.blur();
            }

            if(emailTest == false){
                email.focus();
                email.blur();
            }

            if(phoneNumberTest == false){
                phoneNumber.focus();
                phoneNumber.blur();
            }

            if(departmentTest == false){
                department.focus();
                department.blur();
            }

            if(capSizeTest == false){
                capSize.focus();
                capSize.blur();
            }

            if(degreeTest == false){
                degree.focus();
                degree.blur();
            }

            if(heightTest == false){
                height.focus();
                height.blur();
            }

            if(weight.value < 50 || weight.value > 400){
                weight.focus();
                weight.blur();
            }

            if(grantInstTest == false){
                grantingInstitution.focus();
                grantingInstitution.blur();
            }

            if(grantStateTest == false){
                institutionState.focus();
                institutionState.blur();
            }

            if(grantCityTest == false){
                institutionCity.focus();
                institutionCity.blur();
            }

            if(ceremonyTest == false){
                ceremonyDate.focus();
                ceremonyDate.blur();
            }
        }

    }

    validUserData()
}




//Method to check if a field if valid when the user clicks a field
(function() {
  'use strict';
  window.addEventListener('load', function() {
    // fetch all the forms we want to apply custom style
    var inputs = document.getElementsByClassName('form-control')


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
        }
        else {
            input.classList.add('is-valid')
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


function clearFormData(){

    //Getting form data and storing it in block scope variables
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

    firstName.value = '';
    lastName.value = '';
    email.value = '';
    phoneNumber.value = '';
    department.value = '';
    capSize.value = '';
    degree.value = '';
    weight.value = '';
    height.value = '';
    grantingInstitution.value = '';
    institutionState.value = '';
    institutionCity.value = '';
    ceremonyDate.value = '';
}

window.onload=function(){
    document.getElementById('phoneNumber').addEventListener('keyup',function(evt){
            var phoneNumber = document.getElementById('phoneNumber');
            var charCode = (evt.which) ? evt.which : evt.keyCode;
            phoneNumber.value = phoneFormat(phoneNumber.value);
    });

    let firstName = document.getElementById("firstName");

    firstName.addEventListener('keypress', function ( event ) {
       var key = event.keyCode;
        if (key === 32) {
          event.preventDefault();
        }
    });


    let lastName = document.getElementById("lastName");

    lastName.addEventListener('keypress', function ( event ) {
       var key = event.keyCode;
        if (key === 32) {
          event.preventDefault();
        }
    });
}









