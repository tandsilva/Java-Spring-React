# Java-Spring-React
Projeto dev superior


Skip to content
Search or jump to…
Pull requests
Issues
Codespaces
Marketplace
Explore
 
@tandsilva 
devsuperior
/
sds-dsmeta
Public
Code
Issues
2
Pull requests
1
Actions
Projects
Security
Insights
sds-dsmeta/episodio1/
Latest commit
@acenelio
acenelio Ep1, Ep2
ad2d166
14 hours ago
Git stats
 History
Files
Type
Name
Latest commit message
Commit time
. .
README.md
Ep1, Ep2
14 hours ago
README.md
DevSuperior logo Semana Spring React - Episódio 1
Crie um app completo para seu portfólio com as tecnologias mais demandadas do mercado

Realização
DevSuperior - Escola de programação

DevSuperior no Instagram DevSuperior no Youtube

Objetivos do projeto para esta aula
Criar projetos backend e frontend
Salvar os projeto no Github em monorepo
Montar o visual estático do front end
AVISO: as aulas ficarão disponíveis somente até domingo às 23h59
Checklist
Design Figma
https://www.figma.com/file/PehiT8Dw4Lv5ioTSULZeRI/DSMeta3

https://www.figma.com/file/Yu2RHFmirHQ4BIVZM2XxY6/DSMeta2

https://www.figma.com/file/EN1zFtk4eY3Jgmpgi9YaMG/DSMeta1

Pré-requisito: Git instalado
DÚVIDAS: veja o canal #duvidas-frequentes no Discord do evento

Image

Ferramentas
DÚVIDAS: veja o canal #duvidas-frequentes no Discord do evento

Nodejs 16 e Yarn (vídeo: https://youtu.be/x5tgFTS-CYA )
STS (vídeo: https://youtu.be/TGQ0K9QsX88 )
VS Code
IntelliCode
ESLint
JSX HTML <tags/>
Passo: criar projeto ReactJS
DevSuperior no Instagram

yarn create vite frontend --template react-ts
DÚVIDAS: veja o canal #duvidas-frequentes no Discord do evento

Passo: criar projeto Spring Boot
Criar projeto Spring Boot no Spring Initializr com as seguintes dependências:

Web
JPA
H2
Security
Ajuste no arquivo pom.xml:

<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version><!--$NO-MVN-MAN-VER$ -->
</plugin>
Botão direito no projeto -> Maven -> Update project (force update)
Passo: salvar primeira versão no Github
DÚVIDAS: veja o canal #duvidas-frequentes no Discord do evento

git init

git add .

git commit -m "Project created"

git branch -M main

git remote add origin git@github.com:seuusuario/seurepositorio.git

git push -u origin main
Passo: "limpar" o projeto ReactJS
Vamos pegar o CSS que fizemos nas aulas de preparação:

https://github.com/acenelio/dsmeta-css

COMMIT: Project clean
Passo: Primeiro componente
Projeto HTML/CSS: https://github.com/acenelio/dsmeta-css

COMMIT: First component
Passo: Outros componentes
COMMIT: Other components
Passo: Datepicker
Documentação: https://github.com/Hacker0x01/react-datepicker

yarn add react-datepicker@4.8.0 @types/react-datepicker@4.4.2
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
<DatePicker
    selected={new Date()}
    onChange={(date: Date) => {}}
    className="dsmeta-form-control"
    dateFormat="dd/MM/yyyy"
/>
COMMIT: Datepicker
Passo: React Hook useState para manter estado das datas
Macete para criar uma data de X dias atrás:

const date = new Date(new Date().setDate(new Date().getDate() - 365));
COMMIT: useState


