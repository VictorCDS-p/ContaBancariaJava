# 🏦 Sistema Bancário Virtual

Uma aplicação robusta de terminal desenvolvida em **Java** que simula as operações fundamentais de um caixa eletrônico. O projeto foca em integridade de dados e experiência do usuário via console.

## 📝 Descrição do Projeto

O sistema permite a gestão de uma conta bancária com suporte a múltiplos tipos de conta e operações financeiras em tempo real. O diferencial desta versão é a flexibilidade: o usuário pode optar por carregar um perfil de teste ou configurar seus próprios dados (nome, tipo de conta e saldo) com validações integradas.

## 🚀 Funcionalidades Principais

* **Inicialização Flexível:** Escolha entre preenchimento manual de dados ou um perfil padrão para testes rápidos.
* **Seleção Segura de Conta (Enum):** Implementação de `enum` para limitar os tipos de conta a `CORRENTE`, `POUPANÇA` ou `SALÁRIO`, evitando entradas inválidas.
* **Consulta de Saldo:** Visualização instantânea do saldo com formatação monetária.
* **Depósito Dinâmico:** Atualização imediata do saldo ao receber valores.
* **Transferência com Trava de Segurança:** O sistema valida se há saldo suficiente antes de concluir qualquer débito, impedindo saldos negativos indesejados.

## 🛠️ Tecnologias e Conceitos Utilizados

* **Java 25:** Uso de recursos modernos como **Text Blocks** para menus e **Strings Formatadas**.
* **Enums:** Para garantir a tipagem forte e segurança na seleção do tipo de conta.
* **Loops de Validação:** Uso de `while(true)` com interrupções controladas (`break`) para garantir que o usuário escolha opções válidas na configuração inicial.
* **Scanner & Buffer Management:** Controle preciso de entrada de dados, incluindo limpeza de buffer para alternar entre leituras numéricas e de texto.
