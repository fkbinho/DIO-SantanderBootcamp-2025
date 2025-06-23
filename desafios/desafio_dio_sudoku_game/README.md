# 🧩 Sudoku Game em Java

Este projeto é uma implementação completa do jogo **Sudoku** em Java, com **duas versões distintas**:

- `main`: versão com **interface via console**
- `ui`: versão com **interface gráfica (Swing)**

---

## 📌 Funcionalidades em ambas as versões

✅ Regras tradicionais do Sudoku  
✅ Inicialização com valores fixos pré-configurados  
✅ Preenchimento de campos editáveis  
✅ Verificação do status atual do jogo  
✅ Validação automática de erros  
✅ Finalização com sucesso ao completar corretamente  
✅ Reinício do tabuleiro a qualquer momento

---

## 🔀 Branchs do Projeto

| Branch | Descrição |
|--------|-----------|
| `main` | Versão **console** com interação via terminal |
| `ui`   | Versão com **interface gráfica Swing** |

---

## 🧠 Estrutura Lógica Compartilhada

A base do jogo é comum às duas versões e está nas seguintes classes:

- `Board`: representa o tabuleiro 9x9 com suas regras
- `Space`: representa cada célula, incluindo valor esperado e real
- `GameStatusEnum`: enum com os status do jogo (NÃO INICIADO, INCOMPLETO, COMPLETO)
- `BoardTemplate`: template visual para o console

---

## 🚀 Como Executar

### ✅ Pré-requisitos

- Java 17+
- Terminal ou IDE (Ex: IntelliJ, Eclipse, VS Code)

---

## 💻 Execução no Console (branch `main`)

### 1. Troque para a branch console:

```bash
git checkout main
```

### 2. Compile:

```bash
javac Main.java model/*.java util/*.java
```

### 3. Execute com argumentos:

```bash
java Main 0,0;4,false 1,0;7,false 2,0;9,true ...
```

> Argumentos seguem o formato: `coluna,linha;valor,fixed`  
> Ex: `0,0;4,false` → na posição (0,0), o valor inicial é 4 e **não** é fixo.

---

## 🖼️ Execução com Interface Gráfica (branch `ui`)

### 1. Troque para a branch Swing:

```bash
git checkout ui
```

### 2. Compile:

```bash
javac UIMain.java model/*.java service/*.java ui/**/*.java util/*.java
```

### 3. Execute:

```bash
java UIMain 0,0;4,false 1,0;7,false 2,0;9,true ...
```

---

## 🧪 Argumentos de Exemplo (válidos para ambas as versões)

<details>
<summary><strong>Clique para visualizar os argumentos completos</strong></summary>

```
0,0;4,false 1,0;7,false 2,0;9,true 3,0;5,false 4,0;8,true 5,0;6,true 6,0;2,true 7,0;3,false 8,0;1,false
0,1;1,false 1,1;3,true 2,1;5,false 3,1;4,false 4,1;7,true 5,1;2,false 6,1;8,false 7,1;9,true 8,1;6,true
0,2;2,false 1,2;6,true 2,2;8,false 3,2;9,false 4,2;1,true 5,2;3,false 6,2;7,false 7,2;4,false 8,2;5,true
0,3;5,true 1,3;1,false 2,3;3,true 3,3;7,false 4,3;6,false 5,3;4,false 6,3;9,false 7,3;8,true 8,3;2,false
0,4;8,false 1,4;9,true 2,4;7,false 3,4;1,true 4,4;2,true 5,4;5,true 6,4;3,false 7,4;6,true 8,4;4,false
0,5;6,false 1,5;4,true 2,5;2,false 3,5;3,false 4,5;9,false 5,5;8,false 6,5;1,true 7,5;5,false 8,5;7,true
0,6;7,true 1,6;5,false 2,6;4,false 3,6;2,false 4,6;3,true 5,6;9,false 6,6;6,false 7,6;1,true 8,6;8,false
0,7;9,true 1,7;8,true 2,7;1,false 3,7;6,false 4,7;4,true 5,7;7,false 6,7;5,false 7,7;2,true 8,7;3,false
0,8;3,false 1,8;2,false 2,8;6,true 3,8;8,true 4,8;5,true 5,8;1,false 6,8;4,true 7,8;7,false 8,8;9,false
```

</details>

---

## 🎨 Recursos da Interface Gráfica

- Interface intuitiva com botões:
  - `✔ Verificar Jogo`
  - `🔁 Reiniciar`
  - `🏁 Concluir`
- Campos fixos não editáveis
- Apenas números de 1 a 9 são aceitos
- Validação visual com mensagens `JOptionPane`
- Setores 3x3 bem divididos (como um Sudoku real)

---

## 📁 Organização do Projeto

```bash
├── model/
├── util/
├── service/
├── ui/
├── Main.java             # Versão console
├── UIMain.java           # Versão Swing
└── README.md
```

---