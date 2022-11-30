package in.ashokit.response.bind;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Data
public class Ticket 
{
	private String pnr;
	private String prize;
	private String status;

}
