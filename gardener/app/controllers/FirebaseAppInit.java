package controllers;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseCredentials;
import com.google.inject.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Singleton
public class FirebaseAppInit {

	private volatile FirebaseApp firebaseApp;

	public FirebaseAppInit() throws FileNotFoundException {
		FileInputStream serviceAccount = new FileInputStream("conf/firebaseServiceAccountKey.json");
		FirebaseOptions options = new FirebaseOptions.Builder()
			.setCredential(FirebaseCredentials.fromCertificate(serviceAccount))
			.setDatabaseUrl("https://garden-4e6f7.firebaseio.com/")
			.build();


		firebaseApp = FirebaseApp.initializeApp(options);
	}

	public FirebaseApp getFirebaseApp() {
		return firebaseApp;
	}
}
