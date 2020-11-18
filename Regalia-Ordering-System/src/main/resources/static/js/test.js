            <form action="#" th:action="@{/user/updated}" th:object="${userDto}"
                  method="post">
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label>First Name</label>
                        <input type="text" th:field="*{first_name}" class="form-control" placeholder="First Name" value="" id="firstName" required>
                        <div class="valid-feedback"></div>
                        <div class="invalid-feedback">Please enter a valid first name</div>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label>Last Name</label>
                        <input type="text" th:field="*{last_name}" class="form-control" placeholder="Last Name" id="lastName" value="" required>
                        <div class="valid-feedback"></div>
                        <div class="invalid-feedback">Please enter a valid last name</div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label>Email</label>
                        <input type="text" th:field="*{email}" class="form-control" id="email" placeholder="name@domain.com" required>
                        <div class="valid-feedback"></div>
                        <div class="invalid-feedback">Please enter a valid email</div>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label>Phone Number</label>
                        <input type="number" th:field="*{phone_number}" class="form-control" id="phoneNumber" placeholder="914-554-2354" required>
                        <div class="valid-feedback"></div>
                        <div class="invalid-feedback">Please enter a valid phone number</div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label>Department</label>
                        <select th:field="*{department}" class="custom-select d-block w-100" id="department" required>
                            <option value="">Choose...</option>
                            <div th:each="Department : ${departments}">
                                <option th:text="${Department.name}" th:value="${Department.name}">name</option>
                            </div>
                        </select>
                        <div class="valid-feedback"></div>
                        <div class="invalid-feedback">Please select a department</div>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label>Highest Degree</label>
                        <select th:field="*{degree}" class="custom-select d-block w-100" id="degree" required>
                            <option value="">Choose...</option>
                            <div th:each="Degree : ${degrees}">
                                <option th:text="${Degree.name}" th:value="${Degree.name}">name</option>
                            </div>
                        </select>
                        <div class="valid-feedback"></div>
                        <div class="invalid-feedback">Please select a degree</div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label>Granting Institution</label>
                        <input type="text" th:field="*{granting_institution}" class="form-control" id="grantingInstitution" placeholder="Granting Institution" value="" required>
                        <div class="valid-feedback"></div>
                        <div class="invalid-feedback">Please enter a valid granting institution</div>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label>Granting Institution City</label>
                        <input type="text" th:field="*{granting_city}" class="form-control" id="institutionCity" placeholder="Institution City" value="" required>
                        <div class="valid-feedback"></div>
                        <div class="invalid-feedback">Please enter a valid granting institution city</div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label>Granting Institution State</label>
                        <select th:field="*{granting_state}" class="custom-select d-block w-100" id="institutionState" required>
                            <option value="">Choose...</option>
                            <div th:each="State : ${states}">
                                <option th:text="${State.name}" th:value="${State.name}">name</option>
                            </div>
                            <div class="valid-feedback"></div>
                            <div class="invalid-feedback">Please select a granting institution</div>
                        </select>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label>Ceremony Schedule</label>
                        <select th:field="*{ceremony_date}" class="custom-select d-block w-100" id="ceremonyDate" required>
                            <option value="">Choose...</option>
                            <div th:each="Ceremony : ${ceremonies}">
                                <option th:text="${Ceremony.name}" th:value="${Ceremony.name}">name</option>
                            </div>
                            <div class="valid-feedback"></div>
                            <div class="invalid-feedback">Please select a ceremony</div>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label>Weight (for gown size)</label>
                        <input type="number" th:field="*{weight}" class="form-control" placeholder="Weight" id="weight" value="" required>
                        <div class="valid-feedback"></div>
                        <div class="invalid-feedback">Please enter a valid weight</div>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label>Height (for gown size)</label>
                        <select th:field="*{height}" class="custom-select d-block w-100" id="height" required>
                            <option value=-1>Choose...</option>
                            <option value="4-0"> 4'0"</option>
                            <option value="4-1"> 4'1"</option>
                            <option value="4-2"> 4'2"</option>
                            <option value="4-3"> 4'3"</option>
                            <option value="4-4"> 4'4"</option>
                            <option value="4-5"> 4'5"</option>
                            <option value="4-6"> 4'6"</option>
                            <option value="4-7"> 4'7"</option>
                            <option value="4-8"> 4'8"</option>
                            <option value="4-9"> 4'9"</option>
                            <option value="4-10"> 4'10"</option>
                            <option value="4-11"> 4'11"</option>
                            <option value="5-0"> 5'0"</option>
                            <option value="5-1"> 5'1"</option>
                            <option value="5-2"> 5'2"</option>
                            <option value="5-3"> 5'3"</option>
                            <option value="5-4"> 5'4"</option>
                            <option value="5-5"> 5'5"</option>
                            <option value="5-6"> 5'6"</option>
                            <option value="5-7"> 5'7"</option>
                            <option value="5-8"> 5'8"</option>
                            <option value="5-9"> 5'9"</option>
                            <option value="5-10"> 5'10"</option>
                            <option value="5-11"> 5'11"</option>
                            <option value="6-0"> 6'0"</option>
                            <option value="6-1"> 6'1"</option>
                            <option value="6-2"> 6'2"</option>
                            <option value="6-3"> 6'3"</option>
                            <option value="6-4"> 6'4"</option>
                            <option value="6-5"> 6'5"</option>
                            <option value="6-6"> 6'6"</option>
                            <option value="6-7"> 6'7"</option>
                            <option value="6-8"> 6'8"</option>
                            <option value="6-9"> 6'9"</option>
                            <option value="6-10"> 6'10"</option>
                            <option value="6-11"> 6'11"</option>
                        </select>
                        <div class="valid-feedback"></div>
                        <div class="invalid-feedback">Please select a height</div>
                    </div>
                </div>
                <div class="row" style="justify-content: center;">
                    <div class="col-md-6 mb-3">
                        <label>Cap Size</label>
                        <select th:field="*{cap_size}" class="custom-select d-block w-100" id="capSize" required>
                            <option value="">Choose...</option>
                            <div th:each="CapSize : ${capSizes}">
                                <option th:text="${CapSize.fitted}" th:value="${CapSize.fitted}">name</option>
                            </div>
                            <div class="valid-feedback"></div>
                            <div class="invalid-feedback">Please select a cap size</div>
                        </select>
                    </div>
                </div>
                <div hidden>
                    <label>CWID</label>
                    <select th:field="*{username}" class="custom-select d-block w-100" required>
                        <option th:value="${CWID}"selected>CWID</option>
                    </select>
                </div>
                <hr class="mb-4">
                <div class="row justify-content-center">
                    <div class="d-flex">
                        <button input type="reset" class="btn btn-danger mr-4">
                            Clear Form
                        </button>
                        <!-- Button trigger modal -->
                        <button type="button" class="btn btn-info" onclick="getModalData()" data-toggle="modal" data-target="#previewOrderForm" aria-required="true">
                            Preview Order
                        </button>
                    </div>
                </div>
                <!-- Modal -->
                <div class="modal fade" id="previewOrderForm" tabindex="-1" role="dialog" aria-labelledby="previewOrderFormLable" aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="previewOrderFormLable">Regalia Ordering System</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body" >
                                <div class="container-fluid">
                                    <h4 class="d-flex justify-content-between align-items-center mb-3">
                                        <span class="text-muted">Review Your Order</span>
                                    </h4>
                                    <ul class="list-group mb-3" >
                                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                                            <div>
                                                <h6 class="my-0">First Name</h6>
                                            </div>
                                            <span class="text-muted" id="FirstName"></span>
                                        </li>
                                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                                            <div>
                                                <h6 class="my-0">Last Name</h6>
                                            </div>
                                            <span class="text-muted" id="LastName"></span>
                                        </li>
                                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                                            <div>
                                                <h6 class="my-0">Email</h6>
                                            </div>
                                            <span class="text-muted" id="Email"></span>
                                        </li>
                                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                                            <div >
                                                <h6 class="my-0">Phone Number</h6>
                                            </div>
                                            <span class="text-muted" id="PhoneNumber"></span>
                                        </li>
                                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                                            <div >
                                                <h6 class="my-0">Department</h6>
                                            </div>
                                            <span class="text-muted" id="Department"></span>
                                        </li>
                                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                                            <div >
                                                <h6 class="my-0">Cap Size</h6>
                                            </div>
                                            <span class="text-muted" id="CapSize"></span>
                                        </li>
                                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                                            <div >
                                                <h6 class="my-0">Degree</h6>
                                            </div>
                                            <span class="text-muted" id="Degree"></span>
                                        </li>
                                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                                            <div >
                                                <h6 class="my-0">Weight</h6>
                                            </div>
                                            <span class="text-muted" id="Weight"></span>
                                        </li>
                                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                                            <div >
                                                <h6 class="my-0">Height</h6>
                                            </div>
                                            <span class="text-muted" id="Height"></span>
                                        </li>
                                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                                            <div >
                                                <h6 class="my-0">Granting Institution</h6>
                                            </div>
                                            <span class="text-muted" id="GrantingInstitution"></span>
                                        </li>
                                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                                            <div >
                                                <h6 class="my-0">Institution State</h6>
                                            </div>
                                            <span class="text-muted" id="InstitutionState"></span>
                                        </li>
                                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                                            <div >
                                                <h6 class="my-0">Institution City</h6>
                                            </div>
                                            <span class="text-muted" id="InstitutionCity"></span>
                                        </li>
                                        <li class="list-group-item d-flex justify-content-between lh-condensed">
                                            <div >
                                                <h6 class="my-0">Ceremony Date</h6>
                                            </div>
                                            <span class="text-muted" id="CeremonyDate"></span>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button type="submit" class="btn btn-success">Submit your order</button>
                            </div>
                        </div>
                    </div>
                </div>
            </form>