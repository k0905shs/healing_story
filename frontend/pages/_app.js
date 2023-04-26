import "bootstrap/dist/css/bootstrap.min.css";
import Header from "../src/Layout/Header";
import Footer from "../src/Layout/Footer";
import { Container } from "react-bootstrap";

function App({ Component, pageProps }) {
  return (
    <>
      <Header></Header>
      <Container style={{ minHeight: "80vh" }}>
        <Component {...pageProps} />
      </Container>
      <Footer></Footer>
    </>
  );
}

export default App;
