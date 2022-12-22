==========================================================
HAPPY PATHS:

GET
http://localhost:8081/rest/central/process/retrieve/notes/some_notes_go_here
http://localhost:8081/rest/central/process/retrieve/id/48

POST
http://localhost:8081/rest/central/process/submit
{
    "remarks": "and the number 22 bus goes past";
}

PUT
http://localhost:8081/rest/central/process/update/48
{
"id": 48,
"remarks": "updating blah blah blah",
"submissionTime": "2022-12-22T10:01:10.540629"
}

DELETE
http://localhost:8081/rest/central/process/delete/48

==========================================================
UNHAPPY PATHS:

POST
http://localhost:8081/rest/central/process/submit
{
"id": 47,
"remarks": "oh no, 47 ain't right",
"submissionTime": "2022-12-22T10:01:10.540629"
}

--> returns status 500 - Internal Server Error 

DELETE
http://localhost:8081/rest/central/process/delete/47
--> returns status 400 - Bad Request

==========================================================
FMI - GIT ISSUES LOCALLY WHERE SSH AGENT EXPIRES ON SHUTDOWN:

ssh-agent -s
ssh-add ~/.ssh/[private key]

==========================================================
POSTMAN REQUEST TESTS

pm.test("Verify status code is 200", () => {
    pm.expect(pm.response.code).to.eql(200);
});

pm.test("Verify expected remarks", () => {
    var jsonData = pm.response.json();
    pm.expect(jsonData.remarks).to.eql("blah blah blah");
    pm.expect(jsonData.someEmptyList[0].someValue).to.eql(someValue);
    pm.expect(jsonData.someNonEmptyList.length).to.eql(0);
    pm.expect(jsonData.notDefined)is.not.oneOf([null, undefined]);

});

==========================================================





