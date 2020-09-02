using System;
using System.ComponentModel.DataAnnotations;

namespace Regalia_Ordering_System_WebApi.ViewModels
{
    public class LoginVM
    {
        public string UserName { get; set; }

        [DataType(DataType.Password)]
        public string Password { get; set; }
    }
}
