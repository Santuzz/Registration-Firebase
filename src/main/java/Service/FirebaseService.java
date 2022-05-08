package Service;

import Object.Person;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firestore.v1.WriteResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class FirebaseService {
    /*
    public String saveUserDetails(Person person) throws InterruptedException, ExecutionException{
        Firestore dBFirestore = FirestoreClient.getFirestore();
        //ApiFuture<WriteResult> collectionApiFuture = dBFirestore.collection("users").document(person.getUsername()).set(fields);
    return 0;
    }

     */

}
