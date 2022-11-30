package in.ashokit.request.bind;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@XmlRootElement
@Data
public class Passenger 
{
	private String pname;
	private String from;
	private String to;
	private String doj;

}
