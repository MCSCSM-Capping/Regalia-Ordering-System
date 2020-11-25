//Method to check if a field if valid when the user clicks a field
(function() {
  'use strict';
  window.addEventListener('load', function() {


    // Get the email field
    let email = document.getElementById('newEmail');
    // Email taken div
    let emailTaken = document.getElementById('newEmailTaken')
    // Email format div
    let emailFormat = document.getElementById('newEmailFormat')
    // Submit Button
    let submit = document.getElementById("new-submit");
    // Init a timeout variable to be used below
    let timeout = null;

    let cwid = document.getElementById('newCwid')
    let cwidTaken = document.getElementById('newCwidTaken')
    let cwidFormat = document.getElementById('newCwidFormat')

    //local ref to cwid and email validation
    let cwidValid = false;
    let emailValid = false;


    // Listen for keystroke events
    email.addEventListener('keyup', function (e) {
      // Clear the timeout if it has already been set.
      // This will prevent the previous task from executing
      // if it has been less than <MILLISECONDS>
      clearTimeout(timeout);

      // Make a new timeout set to go off in 1000ms (1 second)
      timeout = setTimeout(function () {
          const url = 'https://regalia.capping.ecrl.marist.edu/user/email/'
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
                    submit.disabled = true;
                    emailValid = false;

                }else{
                    if(email.checkValidity() === true){
                        emailTaken.style.display = "none";
                        emailFormat.style.display = "none";
                        email.classList.remove('is-invalid')
                        email.classList.add('is-valid');
                        emailValid = true;
                         if(emailValid == false || cwidValid == false){
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






    // Listen for keystroke events
        cwid.addEventListener('keyup', function (e) {
          // Clear the timeout if it has already been set.
          // This will prevent the previous task from executing
          // if it has been less than <MILLISECONDS>
          clearTimeout(timeout);

          // Make a new timeout set to go off in 1000ms (1 second)
          timeout = setTimeout(function () {
              const url = 'https://regalia.capping.ecrl.marist.edu/user/check/username/'
              let userCwid = cwid.value;
              let fetchUrl = url + userCwid;

              fetch(fetchUrl)
                .then(response => response.json())
                .then(cwidIsTaken => {
                    if(cwidIsTaken == true){
                        cwidFormat.style.display = "none";
                        cwidTaken.style.display = "block";
                        cwid.classList.remove('is-valid');
                        cwid.classList.add('is-invalid');
                        submit.disabled = true
                        cwidValid = false;

                    }else{
                        if(cwid.checkValidity() === true){
                            cwidTaken.style.display = "none";
                            cwidFormat.style.display = "none";
                            cwid.classList.remove('is-invalid')
                            cwid.classList.add('is-valid');
                            cwidValid = true

                           if(emailValid == false || cwidValid == false){
                                submit.disabled = true;
                            }else{
                                submit.disabled = false;
                            }
                        }else if(email.checkValidity() === false){
                            cwid.classList.remove('is-valid');
                            cwid.classList.add('is-invalid');
                            cwidTaken.style.display = "none";
                            cwidFormat.style.display = "none";
                            submit.disabled = true
                            cwidValid = false
                        }

                        if(cwid.value == '' || cwid.value.length < 8){
                            cwidFormat.style.display = "block";
                            cwidTaken.style.display = "none";
                            cwid.classList.remove('is-valid');
                            cwid.classList.add('is-invalid');
                            cwidValid = false
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
        else  {
            input.classList.add('is-valid')

            console.log(emailValid)
            console.log(cwidValid)
            if(emailValid == false || cwidValid == false){
                submit.disabled = true;
            }else{
                submit.disabled = false;
            }
        }
      }, false);
    });
  }, false);
})()