# Viikkotehtava-1-Kotlin-perusteet

## Kuvaus
Yksinkertainen Android-sovellus, jossa voit:
- Lisätä uusia tehtäviä
- Merkitä tehtäviä tehdyksi tai tekemättömäksi
- Suodattaa tehtäviä tilan mukaan (kaikki / tekemättömät / tehdyt)
- Lajitella tehtäviä määräpäivän mukaan

## Mitä tehtiin
- Tehtävädatamalli `Task` ja prioriteetit `Priority`
- Esimerkkitehtävät `mockTasks`
- Funktiot tehtävien käsittelyyn: lisääminen, tila-muutos, suodatus ja lajittelu
- Käyttöliittymä Composella, listanäkymä ja napit toimintoihin

## Compose-tilanhallinta
Jetpack Compose pitää kirjaa **tilasta**, eli siitä, mitä näytöllä pitäisi näyttää.  
- Jos tilaa muutetaan, Compose piirtää näytön uudelleen automaattisesti.  
- `remember` muistaa tilan vain sen funktion ajan, jossa sitä käytetään.

### Miksi ViewModel on parempi kuin `remember`
- `remember` unohtaa kaiken, jos vaihdat näyttöä tai kierrät puhelinta.  
- **ViewModel** muistaa datan koko ruudun elinkaaren ajan.  
- ViewModel on parempi, jos haluat tallentaa sovelluksen tietoja pidemmäksi aikaa, ja `remember` sopii vain pienen jutun muistamiseen hetkeksi.


## Teknologiat
- Kotlin
- Android Studio

## Asennus ja ajaminen
1. Kloonaa projekti

2. Avaa Android Studiossa

3. Rakenna ja aja sovellus emulaattorissa tai laitteessa
