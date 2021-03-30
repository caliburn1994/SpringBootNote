

top:
	curl http://localhost:8080

people:
	curl http://localhost:8080/people

address:
	curl http://localhost:8080/address

address_1:
	curl http://localhost:8080/address/1

foreign-key_create:
	curl -i -H "Content-Type:application/json" -d '  { "country" : "Japan" }'   http://localhost:8080/address
	curl -i -H "Content-Type:application/json" \
	-d '  { "country" : "China" }' \
	http://localhost:8080/address
	curl -i  -H "Content-Type:application/json" -d \
    '{  "firstName" : "Frodo ",  "lastName" : "Baggins", "address":  ["http://localhost:8080/address/1", "http://localhost:8080/address/2"]}' \
    http://localhost:8080/people

foreign-key_update:
	curl -X PATCH -H "Content-Type:application/json" -d '{"firstName": "Bilbo Jr."}' http://localhost:8080/people/1