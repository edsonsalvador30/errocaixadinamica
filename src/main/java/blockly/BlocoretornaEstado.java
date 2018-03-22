package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoretornaEstado {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param param_Dados
	 * @return Var
	 */
	// BlocoretornaEstado
	public static Var Executar(Var param_Dados) throws Exception {
		return new Callable<Var>() {

			// param
			private Var Dados = param_Dados;
			// end

			public Var call() throws Exception {
				Dados = cronapi.screen.Operations.getValueOfField(Var.valueOf("Estado.active.id"));
				return Dados;
			}
		}.call();
	}

}
