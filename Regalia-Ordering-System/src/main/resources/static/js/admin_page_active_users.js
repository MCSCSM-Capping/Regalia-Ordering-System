function setUserCwid(user){
        //Getting form data and storing it in block scope variables
        let username = user

        console.log(username);

        //Set the form Data with the users CWID
        let ModalUsername = document.getElementById("modelCwidValue");

        ModalUsername.attribute = username;

        ModalUsername.textContent = username;

}

function postDeleteUser(){


    const url = 'http://localhost:8080/delete';

    let usersCwid = document.getElementById("modelCwidValue").textContent;

    // post body data
    const user = {
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
        let heightInches = document.getElementById("heightInches");
        let grantingInstitution = document.getElementById("grantingInstitution");
        let institutionState = document.getElementById("institutionState");
        let institutionCity = document.getElementById("institutionCity");
        let ceremonyDate = document.getElementById("ceremonyDate");

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
                heightInches.value = json.height_inches;
                grantingInstitution.value = json.granting_institution;
                institutionState.value = json.granting_state;
                institutionCity.value = json.granting_city;
                ceremonyDate.value = json.ceremony_date;

                console.log(json)

            })



        firstName.textContent = "Steven"




}


