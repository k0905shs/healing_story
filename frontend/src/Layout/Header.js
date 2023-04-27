import { Container, Nav, Navbar } from "react-bootstrap";
import React, { useState, useEffect } from "react";

const Header = () => {
  return (
    <Navbar bg="light" expand="lg">
      <Container>
        <Navbar.Brand href="/">힐링 스토리</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link href="Psy_Test">심리 검사</Nav.Link>
            <Nav.Link href="Mbti_Test">MBTI 검사</Nav.Link>
            <Nav.Link href="#">힐링 뮤직</Nav.Link>
            <Nav.Link href="#">힐링 플레이스</Nav.Link>
            <Nav.Link href="#">힐링 푸드</Nav.Link>
            <Nav.Link href="#">힐링 커뮤니티</Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
};

export default Header;
