using System;
using System.Collections.Generic;

namespace AgendaClinicaApp
{
    public class AgendaClinica
    {
        private List<Paciente> listaPacientes;

        public AgendaClinica()
        {
            listaPacientes = new List<Paciente>();
        }

        public void AgregarTurno(Paciente paciente)
        {
            listaPacientes.Add(paciente);
            Console.WriteLine("\n✔ Turno registrado exitosamente.");
        }

        public void ConsultarTurnos()
        {
            if (listaPacientes.Count == 0)
            {
                Console.WriteLine("\n⚠ No hay turnos registrados.");
                return;
            }

            Console.WriteLine("\n📋 Lista de turnos registrados:");
            foreach (var p in listaPacientes)
            {
                Console.WriteLine($"🩺 {p.Nombre} | Cédula: {p.Cedula} | Fecha: {p.FechaTurno} | Hora: {p.HoraTurno} | Motivo: {p.Motivo}");
            }
        }

        public void BuscarPorCedula(string cedula)
        {
            bool encontrado = false;

            foreach (var p in listaPacientes)
            {
                if (p.Cedula == cedula)
                {
                    Console.WriteLine($"\n🔍 Turno encontrado: {p.Nombre}, {p.FechaTurno}, {p.HoraTurno}, Motivo: {p.Motivo}");
                    encontrado = true;
                }
            }

            if (!encontrado)
            {
                Console.WriteLine("\n❌ No se encontró un turno con esa cédula.");
            }
        }
    }
}
