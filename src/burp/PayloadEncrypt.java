package burp;

public class PayloadEncrypt implements IIntruderPayloadProcessor {

	private BurpExtender parent;
	
	public PayloadEncrypt(BurpExtender newParent) {
		parent = newParent;
	}
	
    @Override
    public String getProcessorName() {
        return "AES Encrypt";
    }
    
    @Override
    public byte[] processPayload(byte[] currentPayload, byte[] originalPayload, byte[] baseValue) {
        try {
            String payloadString = new String(currentPayload);
            String result = parent.encrypt(payloadString);
            return result.getBytes();
        } catch(Exception e) {
        	parent.callbacks.issueAlert(e.toString());
        	return null;
        }

    }
}


