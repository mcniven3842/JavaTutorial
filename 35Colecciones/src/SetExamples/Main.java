package SetExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

final Set hashSet = new HashSet(1_000_000);
final Long startHashSetTime = System.currentTimeMillis();
for (int i = 0; i < 1_000_000; i++) {
    hashSet.add(i);
}
final Long endHashSetTime = System.currentTimeMillis();
System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));
 
final Set treeSet = new TreeSet();
final Long startTreeSetTime = System.currentTimeMillis();
for (int i = 0; i < 1_000_000; i++) {
    treeSet.add(i);
}
final Long endTreeSetTime = System.currentTimeMillis();
System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));
 
final Set linkedHashSet = new LinkedHashSet(1_000_000);
final Long startLinkedHashSetTime = System.currentTimeMillis();
for (int i = 0; i < 1_000_000; i++) {
    linkedHashSet.add(i);
}
final Long endLinkedHashSetTime = System.currentTimeMillis();
System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
	}

}
/*Los tiempos obtenidos demuestran que, efectivamente, el tiempo de inserción es menor en HashSet y mayor en TreeSet. 
 * Es importante destacar que la inicialización del tamaño inicial del Set a la hora de su creación es importante ya que,
 *  en caso de insertar un gran número de elementos, podrían aumentar el número de colisiones y; con ello,
 *   el tiempo de inserción. */
