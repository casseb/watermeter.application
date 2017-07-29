package objects.basic;

public enum RouteGroup {

	
	NAVEGACAO("Navegação"),
	ADMINISTRATIVO("Administrativo"),
	PROJETO("Projeto"),
	INFORMACOES("Informações"),
	CLIENTES("Clientes"),
	MEUSDADOS("Meus Dados"),
	TERMOS("Termos"),
	COMPETENCIAS("Competências")
	;
	
	public String desc;

	private RouteGroup(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public RouteGroup locateRouteGroupByDesc(String desc){
		for (RouteGroup group : RouteGroup.values()) {
			if(group.desc.equals(desc))
				return group;
			
		}
		return null;
	}
	
	
}
