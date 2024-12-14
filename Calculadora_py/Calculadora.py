import tkinter as tk
from tkinter import messagebox
from PIL import Image, ImageTk
import os

# Función para abrir la calculadora
def abrir_calculadora():
    # Crear una nueva ventana para la calculadora
    calculadora = tk.Toplevel()
    calculadora.title("Calculadora")
    calculadora.geometry("300x400")
    calculadora.resizable(False, False)

    # Variable para la entrada
    entry_var = tk.StringVar()

    # Campo de entrada
    entry = tk.Entry(calculadora, textvariable=entry_var, font=("Arial", 20), bd=10, insertwidth=2, width=14, borderwidth=4, justify="right")
    entry.grid(row=0, column=0, columnspan=4)

    # Función para manejar clics en los botones
    def click_button(valor):
        entry_var.set(entry_var.get() + valor)

    # Función para calcular el resultado
    def calcular():
        try:
            resultado = eval(entry_var.get())
            entry_var.set(str(resultado))
        except Exception as e:
            messagebox.showerror("Error", "Expresión inválida.")
            entry_var.set("")

    # Función para limpiar la pantalla
    def limpiar():
        entry_var.set("")

    # Botones
    botones = [
        ('7', 1, 0), ('8', 1, 1), ('9', 1, 2), ('/', 1, 3),
        ('4', 2, 0), ('5', 2, 1), ('6', 2, 2), ('*', 2, 3),
        ('1', 3, 0), ('2', 3, 1), ('3', 3, 2), ('-', 3, 3),
        ('0', 4, 0), ('.', 4, 1), ('+', 4, 2), ('=', 4, 3),
        ('AC', 5, 0)
    ]

    # Crear y colocar botones
    for (texto, fila, columna) in botones:
        if texto == "=":
            boton = tk.Button(calculadora, text=texto, padx=20, pady=20, font=("Arial", 14), bg="lightgreen",
                              command=calcular)
        elif texto == "AC":
            boton = tk.Button(calculadora, text=texto, padx=20, pady=20, font=("Arial", 14), bg="red", fg="white",
                              command=limpiar)
        else:
            boton = tk.Button(calculadora, text=texto, padx=20, pady=20, font=("Arial", 14),
                              command=lambda t=texto: click_button(t))
        boton.grid(row=fila, column=columna, sticky="nsew")

    for i in range(6):
        calculadora.grid_rowconfigure(i, weight=1)
    for j in range(4):
        calculadora.grid_columnconfigure(j, weight=1)

# Ventana principal
ventana = tk.Tk()
ventana.title("Pantalla de Bienvenida")
ventana.geometry("800x600")
ventana.resizable(False, False)

# Fondo de la ventana
ventana.configure(bg="#336699")

# Etiqueta de bienvenida
bienvenida = tk.Label(ventana, text="Bienvenido", font=("Arial", 24, "bold"), bg="#336699", fg="lightblue")
bienvenida.pack(pady=20)

# Información del grupo
info_grupo = tk.Label(ventana, text="Grupo de 'Interfaces'\n\nEnriquez Miranda Leonardo Andrés\nHernandez Valdivia Adair\nLobato Ramirez Ulises Uriel\nMárquez Celis Jorge\nReyes Rosas César Santiago",
                      font=("Arial", 14), bg="#336699", fg="white", justify="center")
info_grupo.pack(pady=10)

# Imagen (opcional, requiere un archivo en la misma carpeta)
try:
    ruta = os.path.join(os.getcwd(), "Calcu.png")  # Ruta relativa o absoluta
    imagen_calculadora = Image.open(ruta)
    imagen_calculadora = imagen_calculadora.resize((100, 100), Image.Resampling.LANCZOS)
    imagen = ImageTk.PhotoImage(imagen_calculadora)
    etiqueta_imagen = tk.Label(ventana, image=imagen, bg="#336699")
    etiqueta_imagen.pack(pady=10)
except FileNotFoundError:
    print("La imagen 'calculadora.png' no se encontró en la carpeta:", os.getcwd())
except Exception as e:
    print(f"Error al cargar la imagen: {e}")

# Botón para abrir la calculadora
boton_inicio = tk.Button(ventana, text="Iniciar calculadora", font=("Arial", 16), bg="lightblue", fg="black", padx=20, pady=10, command=abrir_calculadora)
boton_inicio.pack(pady=20)

# Iniciar el bucle principal
ventana.mainloop()