==========================================================
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

==========================================================
==========================================================
