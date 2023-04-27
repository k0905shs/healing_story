import Head from "next/head";
import { Container, Row } from "react-bootstrap";

export default function Home() {
  return (
    <>
      <Head>
        <title>힐링 스토리 Healing Story</title>
        <meta
          name="description"
          content="현대인을 위한 마음 치유, 힐링 스토리 Healing Story"
        />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="icon" href="/favicon.ico" />
        <link
          rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        />
        <link rel="stylesheet" href="/css/styles.css" />
        <link
          rel="preload"
          href="/fonts/NotoSansKR-Regular.otf"
          as="font"
          crossOrigin=""
        />
        <link
          rel="preload"
          href="/fonts/NotoSansKR-Bold.otf"
          as="font"
          crossOrigin=""
        />
        <link
          rel="preload"
          href="/fonts/NotoSansKR-Light.otf"
          as="font"
          crossOrigin=""
        />
        <link rel="preload" href="/images/main-banner.png" as="image" />
      </Head>
      <Container fluid className="p-0">
        <Row>
          <img src="/images/main-banner.png" alt="Main Banner" />
        </Row>
      </Container>
    </>
  );
}
