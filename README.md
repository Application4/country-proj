# country-proj

# Save Records (Country & State) mapping
Method Type : Post

URL : http://localhost:8080/save


Request : 1
{"countryCode":"IN","countryName":"India","states":[{"id":11,"regionId":"08","stateName":"ORISSA"},{"id":12,"regionId":"04","stateName":"ASAM"},{"id":13,"regionId":"03","stateName":"BIHAR"},{"id":14,"regionId":"02","stateName":"Andhra Pradesh"}]}

Request : 2
{"countryCode":"AUS","countryName":"AUSTRALIA","states":[{"id":56,"regionId":"95","stateName":"XYZ"},{"id":57,"regionId":"96","stateName":"PQR"},{"id":58,"regionId":"97","stateName":"ABC"},{"id":59,"regionId":"98","stateName":"STU"}]}


# Get states by country code  

Method Type : GET

URL : http://localhost:8080//getState/IN

Response : [{"id":11,"regionId":"08","stateName":"ORISSA"},{"id":12,"regionId":"04","stateName":"ASAM"},{"id":13,"regionId":"03","stateName":"BIHAR"},{"id":14,"regionId":"02","stateName":"Andhra Pradesh"}]


# Get Region ID by state name 

Method Type : GET

URL : http://localhost:8080//getRegionId/ORISSA
