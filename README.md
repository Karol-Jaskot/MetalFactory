# MetalFactory

Projekt aplikacji webowej dla osób chętnych do zdobycia doświadczenia. Poniżej znajduje się lista pomocy oraz założeń na start projektu.

## Tablica 
Tablica do zarządzania projektem znajduje się pod adresem: 
```bash
 https://trello.com/metalfactory/home
```

## Zalecenia

Lista programów zalecanych do realizacji projektu:

Intelij Idea - najlepszy program do tworzenia wszelkich aplikacji w Java (darmowa wersja community w pełni wystarczy)

```bash
 https://www.jetbrains.com/idea/download/#section=windows
```

Github Desktop - aplikacja githuba na komputery. Słuzy do zarządania wersją projektu. Po zainstalowaniu logujecie się na konto githuba i w łatwy sposób zarządacie projektem (dodajecie/pobieracie aktualizacje, wybieracie gałąź projektu (branch). 

```bash
 https://desktop.github.com/
```


## Uruchomienie projektu

Najprostszym sposobem na uruchomienie projektu jest użycie programu Intelij Idea

Na pobraniu repozytorium projektu (ręcznie albo przez gtihub Desktop) uruchamiamy projekt w programie Intelij, po czym wyszukujemy plik: MetalFactoryApplication.class i go uruchamimay. Po kilku sekundach projekt będzie skompliowany i gotowy do pracy. 

Aby zobaczyć gotowy rezultat wystarczy w dowolnej przeglądarce internetowej wejść na adress:
```bash
 http://localhost:8080/
```


## Dodawanie nowych modułów
Dla osób mniej obeznanych z obsługą systemu git: 

branch master - główny kod projektu, stanowi odwzorowanie tego co jest w wersji produkcyjnej (zazwyczaj u klienta)

branch develop - podstawowy kod projektu na którym pracują programiści, jest to taka wersja nad którą pracujemy odając do niej nowe funkcje, a kiedy zakończymy dodawać wszystkie wymagane założenia ( i upewnimi się za pomocą testów że program działa) to przesyłamy wersje z develop do master ( z wersji projektowej do produkcyjnej)

Dodając nowe pliki lub modyfikując isteniejące najlepiej robić to na nowym branch-u utworzonym na bazie develop. Dodawanie commitów bezpośrednio na develop może spowodować że usuniemy komuś jego pracę ( albo ktoś naszą usunie) 

Na starcie osbługa systemu git może być trudna dlatego osoby mniej zaznajomionych dlatego można śmiało pytać o wszystkie szczegóy.

## Pytania
W razie pytań, problemów albo potrzeby lepszego wytłumaczenia pewnych zagadnień można się zgłaszać na slacka grupowego lub do mnie bezpośrednio (Karol jaskot)

