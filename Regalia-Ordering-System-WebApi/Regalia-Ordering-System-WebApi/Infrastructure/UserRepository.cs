using System;
using System.Collections.Generic;
using Regalia_Ordering_System_WebApi.Models;

namespace Regalia_Ordering_System_WebApi.Infrastructure
{
    public static class UserRepository
    {
        public static List<AppUser> Users;

        static UserRepository()
        {
            Users = new List<AppUser>();
        }
    }
}
