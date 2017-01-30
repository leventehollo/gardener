package controllers;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.tasks.Task;
import model.Seed;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;


public class SeedController extends Controller {

	private final FirebaseAppInit firebaseApp;

	@Inject
	public SeedController(FirebaseAppInit firebaseApp) {
		this.firebaseApp = firebaseApp;
	}

    public Result list() {
        return ok("Seed list");
    }

    public Result addSeed() {
		final FirebaseDatabase db = FirebaseDatabase.getInstance(firebaseApp.getFirebaseApp());
		final DatabaseReference seedsRef = db.getReference("seeds");
		final Task<Void> task = seedsRef.child("test").setValue(new Seed("saláta"));

		return ok(firebaseApp.getFirebaseApp().getName());
    }

}
