import com.acromere.mazer.Mazer;
import com.acromere.xenon.Module;

module com.acromere.mazer {

	// Compile-time only
	requires static lombok;

	// Both compile-time and run-time
	requires com.acromere.xenon;
	requires com.acromere.zenna;
	requires com.acromere.zerra;
	requires com.acromere.zevra;
	requires javafx.controls;
	requires javafx.graphics;

	opens com.acromere.mazer.bundles;

	exports com.acromere.mazer to com.acromere.xenon, com.acromere.zerra;

	provides Module with Mazer;

}
