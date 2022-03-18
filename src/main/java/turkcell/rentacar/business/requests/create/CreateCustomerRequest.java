package turkcell.rentacar.business.requests.create;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCustomerRequest {
	
	@Size(min=1,max=20)
	@NotNull
	private String email;
	
	@Size(min=1,max=50)
	@NotNull
	private String password;

}
