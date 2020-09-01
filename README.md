# Regalia-Ordering-System
Repository for CMPT475 - CS/ITS Project (Capping)


# Development Installation Guide

Step 1. Clone the Master repository to your local computer.
> git clone https://github.com/StevenBuglione/Regalia-Ordering-System.git

Step 2. Change directories to Regalia-Ordering-System-WebApi
> cd Regalia-Ordering-System-WebApi/

Step 3. Restore the packages required for running the Asp.Net.Core WebApi
> dotnet restore

Step 4. Change directories to Regalia-Ordering-System-SPA
> cd ..

> cd Regalia-Ordering-System-SPA/

Step 5. Restore the packages required for running the Angular 10 SPA Client Application
> npm i 
> If there are errors run as Admin

> sudo npm i (enter password)

# Inorder to run the project you will need to run both projects at the same time

To Run Regalia-Ordering-System-WebApi

> cd Regalia-Ordering-System-WebApi/
> dotnet watch run - watch run will look for any new changes made to the WebApi and will restart the server if changes are made

> dotnet run - will run the WebApi, However, any new changes made to the WebApi will require a server restart

> To restart the WebApi just Control-C and preform another dotnet run 

To Run Regalia-Ordering-System-SPA 

> cd Regalia-Ordering-System-SPA/

> npm start or ng serve

The project should now be up and running


# Create a new branch
The formate of the branch should be as follows
>  $ git branch YOUR_MARIST_USERNAME

>  $ git checkout YOUR_MARIST_USERNAME

# Do not Update the Master Branch Until We have a code review

> Update your your own branch and issue a pull request for review

Additonal Resources:
>'https://angular.io/'

>'https://docs.microsoft.com/en-us/aspnet/core/introduction-to-aspnet-core?view=aspnetcore-3.1'

>'https://apereo.github.io/cas/4.2.x/protocol/CAS-Protocol.html'

>'https://iam.harvard.edu/resources/cas-integration'

>'https://docs.microsoft.com/en-us/aspnet/core/data/entity-framework-6?view=aspnetcore-3.1'

>'https://docs.microsoft.com/en-us/aspnet/core/data/ef-mvc/intro?view=aspnetcore-3.1'
