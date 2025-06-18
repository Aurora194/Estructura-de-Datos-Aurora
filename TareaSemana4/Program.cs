using System;

namespace AgendaClinicaApp
{
    class Program
    {
        static void Main(string[] args)
        {
            AgendaClinica agenda = new AgendaClinica();
            int opcion;

            do
            {
                Console.WriteLine("=== AGENDA DE TURNOS DE LA CLÍNICA ===");
                Console.WriteLine("1. Registrar turno");
                Console.WriteLine("2. Ver turnos registrados");
                Console.WriteLine("3. Buscar turno por cédula");
                Console.WriteLine("4. Salir");
                Console.Write("Selecciona una opción: ");

                if (!int.TryParse(Console.ReadLine(), out opcion))
                {
                    Console.WriteLine("⚠️ Opción inválida. Intente de nuevo.\n");
                    continue;
                }

                switch (opcion)
                {
                    case 1:
                        Paciente paciente;
                        Console.Write("\nIngrese cédula del paciente: ");
                        paciente.Cedula = Console.ReadLine();
                        Console.Write("Ingrese nombre completo: ");
                        paciente.Nombre = Console.ReadLine();
                        Console.Write("Ingrese motivo de la consulta: ");
                        paciente.MotivoConsulta = Console.ReadLine();
                        Console.Write("Ingrese fecha del turno (dd/mm/aaaa): ");
                        paciente.FechaTurno = Console.ReadLine();
                        Console.Write("Ingrese hora del turno (HH:mm): ");
                        paciente.HoraTurno = Console.ReadLine();

                        agenda.AgregarTurno(paciente);
                        break;

                    case 2:
                        agenda.VerTurnos();
                        break;

                    case 3:
                        Console.Write("\nIngrese cédula a buscar: ");
                        string cedulaBuscar = Console.ReadLine();
                        agenda.BuscarTurno(cedulaBuscar);
                        break;

                    case 4:
                        Console.WriteLine("👋 Saliendo del sistema...");
                        break;

                    default:
                        Console.WriteLine("⚠️ Opción inválida. Intente de nuevo.\n");
                        break;
                }

            } while (opcion != 4);
        }
    }
}


