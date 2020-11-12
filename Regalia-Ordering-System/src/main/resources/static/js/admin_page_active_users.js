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
        let heightFeet = document.getElementById("heightFeet");
        let heightInches = document.getElementById("heightInches");
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
                heightFeet.value = json.height_feet;
                heightInches.value = json.height_inches;
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
        let firstNameDOM = document.getElementById("firstName").value;
        let lastNameDOM = document.getElementById("lastName").value;
        let emailDOM = document.getElementById("email").value;
        let phoneNumberDOM = document.getElementById("phoneNumber").value;
        let departmentDOM = document.getElementById("department").value;
        let capSizeDOM = document.getElementById("capSize").value;
        let degreeDOM = document.getElementById("degree").value;
        let weightDOM = document.getElementById("weight").value;
        let heightFeetDOM = document.getElementById("heightFeet").value;
        let heightInchesDOM = document.getElementById("heightInches").value;
        let grantingInstitutionDOM = document.getElementById("grantingInstitution").value;
        let institutionStateDOM = document.getElementById("institutionState").value;
        let institutionCityDOM = document.getElementById("institutionCity").value;
        let ceremonyDateDOM = document.getElementById("ceremonyDate").value;
        let roleDOM = document.getElementById("role").value;


        const user = {
            first_name : firstNameDOM,
            last_name : lastNameDOM,
            email : emailDOM,
            phone_number : phoneNumberDOM,
            department : departmentDOM,
            cap_size : capSizeDOM,
            degree : degreeDOM,
            weight : weightDOM,
            height_feet : heightFeetDOM,
            height_inches : heightInchesDOM,
            granting_institution : grantingInstitutionDOM,
            granting_state : institutionStateDOM,
            granting_city : institutionCityDOM,
            ceremony_date : ceremonyDateDOM,
            role : roleDOM,
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
        .then(res => res.json())

        window.location.href = "/admin_page_active_users"



}

function createNewUser() {

    // Api Requirements
    const route = 'https://regalia.capping.ecrl.marist.edu/user/add';
    let url = route;

    let firstNameDOM = document.getElementById("newFirstName").value;
    let lastNameDOM = document.getElementById("newLastName").value;
    let emailDOM = document.getElementById("newEmail").value;
    let phoneNumberDOM = document.getElementById("newPhoneNumber").value;
    let departmentDOM = document.getElementById("newDepartment").value;
    let capSizeDOM = document.getElementById("newCapSize").value;
    let degreeDOM = document.getElementById("newDegree").value;
    let weightDOM = document.getElementById("newWeight").value;
    let heightFeetDOM = document.getElementById("newHeightFeet").value;
    let heightInchesDOM = document.getElementById("newHeightInches").value;
    let grantingInstitutionDOM = document.getElementById("newGrantingInstitution").value;
    let institutionStateDOM = document.getElementById("newInstitutionState").value;
    let institutionCityDOM = document.getElementById("newInstitutionCity").value;
    let ceremonyDateDOM = document.getElementById("newCeremonyDate").value;
    let roleDOM = document.getElementById("newRole").value;
    let usernameDom = document.getElementById("newCwid").value;


    const user = {
        first_name : firstNameDOM,
        last_name : lastNameDOM,
        email : emailDOM,
        phone_number : phoneNumberDOM,
        department : departmentDOM,
        cap_size : capSizeDOM,
        degree : degreeDOM,
        weight : weightDOM,
        height_feet : heightFeetDOM,
        height_inches : heightInchesDOM,
        granting_institution : grantingInstitutionDOM,
        granting_state : institutionStateDOM,
        granting_city : institutionCityDOM,
        ceremony_date : ceremonyDateDOM,
        role : roleDOM,
        username: usernameDom
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


