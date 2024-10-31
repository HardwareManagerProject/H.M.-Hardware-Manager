![Header](./H.M._Header.png)

# H.M. (Hardware Manager) - Levantamento de Requisitos

**Projeto:** Gerenciador de Hardware para Laboratórios

**Data:** 24/10/2024

**Reponsáveis:** @Xenoxys1 e @eduardahermannalmeida

---

## Introdução

### Objetivo
O objetivo deste documento é detalhar os requisitos funcionais e não funcionais do sistema "Gerenciador de Hardware para Laboratórios", que permitirá o controle e monitoramento de máquinas, consertos, peças trocadas e inventário de componentes em um ou mais laboratórios.

### Escopo

O sistema gerenciará:

- Cadastro e controle de máquinas de diversos laboratórios.
- Registro de manutenções, consertos e peças trocadas.

###  Definições, Acrônimos e Abreviações

- **Máquina**:
Ao mencionar máquina nos referimos aos computadores, sejam eles do tipo Desktop ou Notebook.

- **Conserto**:
Conserto ou manutenção é a resolução de erros ou problemas que podem vir a ser encontrados nas máquinas.

- **Inventário**:
É nele que é contido as máquinas e suas respectivas informações.

### Requisitos Funcionais

####  Cadastro de Máquinas

- **RF-01**: O sistema deve permitir o cadastro de máquinas, incluindo suas especificações de hardware (CPU, RAM, armazenamento).
- **RF-02**: O sistema deve permitir a associação de cada máquina a um laboratório específico.
- **RF-03**: O sistema deve exibir o status atual da máquina (funcionando, em manutenção, fora de uso).

#### Controle de Consertos e Manutenções

- **RF-04**: O sistema deve permitir registrar manutenções corretivas e preventivas realizadas em uma máquina.
- **RF-05**: O sistema deve permitir associar peças utilizadas no conserto à respectiva manutenção.
- **RF-06**: O sistema deve armazenar um histórico completo de todas as manutenções realizadas em cada máquina.
- **RF-07**: O sistema deve permitir a criação de agendamentos de manutenções preventivas para as máquinas.

#### Controle de Peças

- **RF-08**: O sistema deve armazenar as informações das peças em uma tabela, como Status, Especificações, Nome e entre outros.
- **RF-09**: O sistema deve permitir o cadastro de diferentes tipos de peças para serem usadas nos equipamentos ou para receberem manutenção.

#### Gerenciamento de Laboratórios

- **RF-10**: O sistema deve permitir gerenciar múltiplos laboratórios, associando máquinas a seus respectivos locais.
- **RF-11**: O sistema deve exibir um painel geral que mostre o status das máquinas em todos os laboratórios.

#### Relatórios e Auditorias

- **RF-12**: O sistema deve gerar relatórios de consertos e manutenções realizados em um período definido.

#### Controle de Acesso e Usuários

- **RF-13**: O sistema deve permitir a criação de perfis de usuário com diferentes níveis de acesso (técnicos, administradores).

### Requisitos Não Funcionais

#### Desempenho

- **RNF-01**: O sistema deve ser capaz de processar e exibir informações de até 1000 máquinas e peças de hardware sem perda significativa de desempenho.

#### Usabilidade

- **RNF-02**: O sistema deve possuir uma interface intuitiva, facilitando o registro de manutenções e o gerenciamento de inventário por técnicos.

#### Confiabilidade

- **RNF-03**: O sistema deve manter backup automático dos dados cadastrados a cada 24 horas.

#### Portabilidade

- **RNF-04**: O sistema deve ser multiplataforma, funcionando em ambientes Windows, Linux e macOS.

#### Segurança

- **RNF-05**: O sistema deve garantir o controle de acesso por meio de autenticação de usuário.
- **RNF-06**: Todas as ações dos usuários devem ser registradas para auditoria futura.

### Requisitos de Interface

#### Interface Gráfica

- **RI-01**: O sistema deve ter uma interface gráfica baseada em JavaFX ou Swing.
- **RI-02**: O sistema deve exibir gráficos de desempenho de máquinas e peças através de bibliotecas como JFreeChart.

#### Relatórios

- **RI-03**: O sistema deve permitir a geração de relatórios em tempo real, com filtros de data, laboratório ou máquina específica.

---

### Considerações Finais

O sistema "Gerenciador de Hardware para Laboratórios" deve facilitar o controle e o monitoramento das máquinas e peças de hardware, proporcionando maior eficiência na gestão de manutenção e inventário dos laboratórios. Este documento deverá ser revisado periodicamente conforme novas funcionalidades e necessidades sejam identificadas.

![Footer](./H.M.Footer.png)
