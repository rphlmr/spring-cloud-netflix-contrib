# How it works

`routeplanner` project is the "public api"

`trainplanner` and `carplanner` are internals api that contact databases (simulated).

The database access simulate high latency (33% and 20% of random failures, with randmon timeout).

`service-gateway` is not used.

`Hystrix dashboard` hosted on `routeplanner`.

URI : `http://localhost:8080/plan?departureCity=CityA&arrivalCity=CityB`