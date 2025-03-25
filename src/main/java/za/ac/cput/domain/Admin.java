package za.ac.cput.domain;


    public class Admin {

        private int adminID;

        private String name;

        private String email;

        private String password;

        private Admin(){


        }
        public Admin(Builder build){
            this.adminID=build.adminID;
            this.name=build.name;
            this.email=build.email;
            this.password=build.password;
        }

        public int getAdminID() {
            return adminID;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        @Override
        public String toString() {
            return "Admin{" +
                    "adminID=" + adminID +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }


        public static class Builder{
            private int adminID;

            private String name;

            private String email;

            private String password;

            public Builder setAdminID(int adminID) {
                this.adminID = adminID;
                return this;
            }

            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public Builder setEmail(String email) {
                this.email = email;
                return this;
            }

            public Builder setPassword(String password) {
                this.password = password;
                return this;
            }
            public Builder copy (Admin admin){
                this.adminID=admin.adminID;
                this.name=admin.name;
                this.email=admin.email;
                this.password=admin.password;

                return this;
            }

            public Admin build(){

                return new Admin(this);

            }
        }

    }


