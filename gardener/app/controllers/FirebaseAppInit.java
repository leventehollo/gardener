package controllers;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseCredentials;
import com.google.inject.Singleton;
import play.Logger;
import play.api.Configuration;

import javax.inject.Inject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Singleton
public class FirebaseAppInit {

	private FirebaseApp firebaseApp;

	@Inject
	public FirebaseAppInit(Configuration configuration) {
		final String firebaseConfigPath = configuration.underlying().getString("gardener.firebase.configPath");
		Logger.debug("Firebase Config Path: " + firebaseConfigPath);
		if (firebaseApp == null) {
			FileInputStream serviceAccount = null;
			try {
				serviceAccount = new FileInputStream(firebaseConfigPath);
				FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredential(FirebaseCredentials.fromCertificate(serviceAccount))
					.setDatabaseUrl("https://garden-4e6f7.firebaseio.com/")
					.build();

				firebaseApp = FirebaseApp.initializeApp(options);

			} catch (FileNotFoundException e) {
				Logger.error("Failed to read Firebase configuration", e);
			}
		}
	}


	public FirebaseApp getFirebaseApp() {
		return FirebaseApp.getInstance(FirebaseApp.DEFAULT_APP_NAME);
	}
}
