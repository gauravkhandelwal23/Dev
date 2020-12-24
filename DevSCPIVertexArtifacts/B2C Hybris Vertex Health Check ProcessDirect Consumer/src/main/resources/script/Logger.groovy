import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;


def Message HealthCheckResponse(Message message) {
	processData("HealthCheckResponse", message);
}

def Message processData(String prefix, Message message){
	def headers = message.getHeaders();
	def map = message.getProperties();
	def body=message.getBody(java.lang.String) as String;
	def messageLog=messageLogFactory.getMessageLog(message);
	if(messageLog !=null){
		messageLog.addAttachmentAsString(prefix,body,"text/xml");
	}
	return message;
} 