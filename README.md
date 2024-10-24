![Header](./Placeholder.png)

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
Lorem ipsum odor amet, consectetuer adipiscing elit. Enim laoreet ut; dolor faucibus molestie posuere amet tempus. Congue commodo sit fames conubia pretium finibus adipiscing convallis bibendum. Mauris nullam arcu dapibus in enim erat. Scelerisque tristique quam hac ridiculus habitant nisi est. Ultrices velit eleifend malesuada ornare odio vitae congue erat. Laoreet nisi elementum curabitur proin netus tincidunt ad.

- **Conserto**:
Lorem ipsum odor amet, consectetuer adipiscing elit. Enim laoreet ut; dolor faucibus molestie posuere amet tempus. Congue commodo sit fames conubia pretium finibus adipiscing convallis bibendum. Mauris nullam arcu dapibus in enim erat. Scelerisque tristique quam hac ridiculus habitant nisi est. Ultrices velit eleifend malesuada ornare odio vitae congue erat. Laoreet nisi elementum curabitur proin netus tincidunt ad.

- **Inventário**:
Lorem ipsum odor amet, consectetuer adipiscing elit. Enim laoreet ut; dolor faucibus molestie posuere amet tempus. Congue commodo sit fames conubia pretium finibus adipiscing convallis bibendum. Mauris nullam arcu dapibus in enim erat. Scelerisque tristique quam hac ridiculus habitant nisi est. Ultrices velit eleifend malesuada ornare odio vitae congue erat. Laoreet nisi elementum curabitur proin netus tincidunt ad.

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

#### Gerenciamento de Laboratórios

- **RF-08**: O sistema deve permitir gerenciar múltiplos laboratórios, associando máquinas a seus respectivos locais.
- **RF-09**: O sistema deve exibir um painel geral que mostre o status das máquinas em todos os laboratórios.

#### Relatórios e Auditorias

- **RF-10**: O sistema deve gerar relatórios de consertos e manutenções realizados em um período definido.

#### Controle de Acesso e Usuários

- **RF-11**: O sistema deve permitir a criação de perfis de usuário com diferentes níveis de acesso (técnicos, administradores).

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

![Footer](./Placeholder.png)
