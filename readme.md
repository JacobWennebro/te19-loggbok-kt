# TE19 Loggbok Kotlin Post Mortem

Jacob Wennebro 2022-03-12

## Inledning

Syftet med denna programvara var att kunna spara ned ett meddelande samt författare och datum ned till en fil. Denna fil skulle sedan kunna läsas utav programmet och ladda in samma data som den sparade ned.

## Bakgrund

Jag valde att göra mitt program konsol baserat, på så sätt är alla inputs utav information som programmet hanterar givet till programmerat genom konsolen. Det betyder egentligen bara att jag inte behövde använda mig utav någon egen gjord GUI eller nåt åt det slaget.

Att få input från användaren, skapa ett objekt utav det i form utav en kotlin class var inga bekymmer, dock hade jag problem med att kunna spara ned objektet till en fil som sedan gick att läsas in. Jag lyckades spara ned data till en fil men inte mitt objekt utan att få errors.


## Positiva erfarenheter

Jag har till viss del kunnat söka fram de svar jag letat efter specifikt för Kotlin, syntax osv.

## Negativa erfarenheter

Jag fick tyvärr inte min nedsparning utav objekt att fungera, varesig det är en Kotlin-grej eller bara JVM är jag även osäker om.