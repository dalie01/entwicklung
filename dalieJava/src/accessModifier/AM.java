package accessModifier;

/**
 * 
<table border="1">
<tr align="center">
<th></th>
<th>Die Klasse selbst</th>
<th>Paket-Klassen/<br />
innere Klassen</th>
<th>Unterklassen</th>
<th>Sonstige<br />
Klassen</th>
</tr>
<tr align="center">

<th align="left">private</th>
<td>Ja</td>
<td>Nein<sup id="cite_ref-5" class="reference"><a href="#cite_note-5">[A 1]</a></sup></td>
<td>Nein</td>
<td>Nein</td>
</tr>
<tr align="center">
<td align="left"><i>(ohne)</i><sup id="cite_ref-6" class="reference"><a href="#cite_note-6">[A 2]</a></sup></td>
<td>Ja</td>

<td>Ja</td>
<td>Nein</td>
<td>Nein</td>
</tr>
<tr align="center">
<th align="left">protected</th>
<td>Ja</td>
<td>Ja</td>
<td>Ja</td>
<td>Nein</td>

</tr>
<tr align="center">
<th align="left">public</th>
<td>Ja</td>
<td>Ja</td>
<td>Ja</td>
<td>Ja</td>
</tr>
</table>
<ol class="references">
<li id="cite_note-5"> Um inneren Klassen den Zugriff auf private Methode und Eigenschaften dennoch zu ermöglichen, werden vom Compiler statische, paket-private Methoden erstellt, die den Aufruf, das Setzen oder das Auslesen emulieren. Diese Methoden tragen den Namen <code>access$xxx</code>, wobei <code>xxx</code> für eine fortlaufende Nummer steht.</li>

<li id="cite_note-6"> Häufig auch als „package private“ bezeichnet, obwohl es diesen Zugriffsmodifikator nicht gibt.</li>
</ol>
 
**/
public class AM {

}


