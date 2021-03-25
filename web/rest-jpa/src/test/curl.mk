

top:
	curl http://localhost:8080

people:
	curl http://localhost:8080/people

foreign-key:
	curl -i -H "Content-Type:application/json" -d '  { "country" : "Japan" }'   http://localhost:8080/address
#	curl -i -H "Content-Type:application/json" \
#	-d '  { "country" : "China" }' \
#	http://localhost:8080/address
#	curl -i  -H "Content-Type:application/json" -d \
#    '{  "firstName" : "Frodo-2021-03-24.18:26",  "lastName" : "Baggins", "address": \
#    ["http://localhost:8080/address/1", \
#    "http://localhost:8080/address/2"] \
#    }' \
#    http://localhost:8080/people