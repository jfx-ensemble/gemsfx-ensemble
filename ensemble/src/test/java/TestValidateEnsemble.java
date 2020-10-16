import com.javafxensemble.website.test.ValidateEnsemble;

public class TestValidateEnsemble extends ValidateEnsemble {
    public TestValidateEnsemble() {
        skippedClasses().add("com.dlsc.gemsfx.demo.PaymentOptionTilesApp");
        skippedClasses().add("library.assistant.ui.main.Main");
    }

}
