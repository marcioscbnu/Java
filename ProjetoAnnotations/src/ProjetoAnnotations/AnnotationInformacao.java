package ProjetoAnnotations;

@interface AnnotationInformacao {

	String autor();
	int    aulaEADNumero();
	String website() default "https://www.senai.com.br";
}
