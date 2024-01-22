-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-01-2024 a las 11:46:27
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `government`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `client`
--

CREATE TABLE `client` (
  `ID` int(11) NOT NULL,
  `DNI` varchar(255) DEFAULT NULL,
  `Apellido` varchar(255) DEFAULT NULL,
  `Nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `client`
--

INSERT INTO `client` (`ID`, `DNI`, `Apellido`, `Nombre`) VALUES
(1, '123456', 'Peralbo Pliego', 'Antonio'),
(2, '111111', 'Peralbo Pliego', 'Martin'),
(3, '51492233S', 'Viyuela', 'Pepe');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turn`
--

CREATE TABLE `turn` (
  `ID` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `Estado` varchar(255) DEFAULT NULL,
  `client` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `turn`
--

INSERT INTO `turn` (`ID`, `fecha`, `Nombre`, `Estado`, `client`) VALUES
(1, '2024-01-18', 'renovacion DNI', 'en-espera', 1),
(2, '2024-01-21', 'Cambio de padron', 'ya-atendido', 1),
(3, '2024-01-18', 'Cambio de padron', 'en-espera', 2),
(5, '2024-01-18', 'Cambio de padron', 'ya-atendido', 2),
(7, '2024-01-21', 'renovacion DNI', 'en-espera', 1),
(8, '2024-01-21', 'otras consultas', 'en-espera', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `turn`
--
ALTER TABLE `turn`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_TURN_client` (`client`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `client`
--
ALTER TABLE `client`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `turn`
--
ALTER TABLE `turn`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `turn`
--
ALTER TABLE `turn`
  ADD CONSTRAINT `FK_TURN_client` FOREIGN KEY (`client`) REFERENCES `client` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
