import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;
def Message processData(Message message) {
		//Body 
	def body = message.getBody();
	//Headers 
String appUrl = System.getenv("HC_APPLICATION_URL");
String  TMN_ShortName=appUrl.substring(8,15)
message.setProperty("P_Tenant_Name", TMN_ShortName);
	return message;
}
