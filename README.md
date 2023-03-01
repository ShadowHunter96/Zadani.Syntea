Úloha „Třídění knih“

Vytvořte program, který má na vstupu soubor knihy.xml a číslo „rok zlomu“.
Výstupem programu budou dva soubory knihy_stare.csv a knihy_nove.csv.
Soubor knihy.xml obsahuje seznam elementů kniha a každý obsahuje údaje ISBN, Vydano ,Nazev, Jmeno a
Prijmeni – vždy jsou všechny údaje zadané.

Soubor knihy_stare.csv bude obsahovat všechny knihy vydané před rokem zlomu a soubor knihy_nove.csv
bude obsahovat všechny knihy vydané v roce zlomu nebo po roce zlomu.

Soubory knihy_stare.csv a knihy_nove.csv budou mít formát CSV s prvním fixním řádkem obsahujícím názvy
položek, následnými řádky obsahující příslušná data – viz přiložený ukázkový soubor ukazka_knihy.csv.
Oddělovací znak mezi položkami je středník.

Atributy Jmeno a Prijmeni z knihy.xml budou na výstupu spojeny do položky Autor v csv souboru. Ostatní
atributy ISBN, Vydano, Nazev budou převedeny do stejnojmenných položek v csv souboru.
Program při spuštění dostane na vstupu 2 parametry:

1. Cestu na soubor knihy.xml
2. Číslo rok zlomu
   a výstupní soubory se vytvoří do aktuálního pracovního adresáře programu.
   Program vyzkoušejte a odlaďte a pošlete nám zdrojový kód a spustitelnou verzi.