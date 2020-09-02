using System;
using System.ComponentModel.DataAnnotations;

namespace Regalia_Ordering_System_WebApi.ViewModels
{
    public class RegisterVM
    {
        public string UserName { get; set; }

        [DataType(DataType.EmailAddress)]
        public string Email { get; set; }

        [DataType(DataType.Password)]
        public string Password { get; set; }

        [Compare("Password")]
        [DataType(DataType.Password)]
        public string ConfirmPassword { get; set; }
    }
}
