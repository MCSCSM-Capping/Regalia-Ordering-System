﻿using System;
namespace Regalia_Ordering_System_WebApi.Models
{
    public class AppUser
    {
        public string Id { get; set; }
        public string UserName { get; set; }
        public string Email { get; set; }
        public string NormalizeUserName { get; set; }
        public string PasswordHash { get; set; }
    }
}
