package SingletonPattern;

public class Database {

    private static Database instance;
    private String url;
    private String userName;
    private String password;

    private Database(String url, String userName, String password) {
        this.url = url;
        this.userName = userName;
        this.password = password;
    }

    public static Database getInstance() {
        if(instance == null) {     // double checked locking
            synchronized(Database.class) {
                if(instance == null) {
                    instance = new Database(null, null, null);
                }
            }
        }
        return instance;
    }

}

/**
 * what is singleton ?
 * A class should have only one object
 * 
 * How we can implement singleton ?
 * 1. private constructor
 * 2. static attribute, Method
 * 3. Eager initializing [class loade time game]
 * 
 * we can perform egar initialization aka egar loading 
 * 1. delay applocaion startup time
 * 2. not always possible
 * 
 * double checked locking [which i have implememted] it is thread - safe as well [using lock]
 */


/**
 * why singleton ?
 * 1. shared resource
 * 2. no attributes / immutable
 * 3. expensive object creation
 * 
 * Break singleton using reflection and serialization
 * and this can be solved by enum
 */ 


//  public static synchronized Database getInstance() {
//     if(getInstance == null) {     // double checked locking
//         getInstance = new Database(null, null, null);
//     }
//     return getInstance;
// }

/**
 * Homework
 * Learn how to create singleton using enums
 */