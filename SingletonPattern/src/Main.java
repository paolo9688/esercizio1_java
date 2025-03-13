/*
Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
Creare 2 oggetti User di cui creerà un'istanza.
Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video
*/

package SingletonPattern.src;

public class Main {
    public static void main(String[] args) throws Exception {
        //creo uno user1 con le informazioni di default e le stampo a video:
        User user1 = User.getInstance("Mario", 25);
        System.out.println(user1);

        //creo uno user2 e uso i metodi setter per cambiare le informazioni di default che poi stampo a video:
        User user2 = User.getInstance("Mario", 25);
        user2.setName("Luigi");
        user2.setAge(30);
        System.out.println(user2);
    }
}
