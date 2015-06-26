package burp;

public class PayloadDecrypt implements IIntruderPayloadProcessor {

	private BurpExtender parent;
	
	public PayloadDecrypt(BurpExtender newParent) {
		parent = newParent;
	}
	
    @Override
    public String getProcessorName() {
        return "AES Decrypt";
    }
    
    @Override
    public byte[] processPayload(byte[] currentPayload, byte[] originalPayload, byte[] baseValue) {
        try {
            String payloadString = new String(currentPayload);
            String result = parent.decrypt(payloadString);
            return result.getBytes();
        } catch(Exception e) {
        	parent.callbacks.issueAlert(e.toString());
        	return null;
        }

    }
}


