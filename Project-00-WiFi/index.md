---
layout: default
---

# Project-00-WiFi README

## Context

We are a small development shop with locations in shared co-working offices.

## Business Problem to Solve

What:

- let only authorized employee endpoints (laptops) on the company WiFi
- Support centralized revocation of the Wifi access to make sure that the fired employee looses connectivity to company resources immediately.

Why:

- ensure information security;
- reduce the attack surface;
- ensure fine-grain control over employee access rights, e.g. prevent fired employees from accessing company intranet.

## Deliverables

- properly configured IT infrastructure
- github repo documenting all the steps
- LinkedIn article

## Constraints

- local IT components should be running Linux/Proxmox/TrueNAS on the existing hardware.
- Employees are using a mix of client OSes - MacOS/Windows/Linux - all these should be supported.
- Mobile phone support on company WiFi is a plus but not required.
- WiFi access will be provided via UniFi access points - these are cheap and readily aavilable.
- Do NOT use 2.4 GHz band, stick to 5 GHz and 6 GHz bands

## TODO RoadMap

### 1 week

- install proxmox on a provided micro server
- run UniFi controller in an LXC container, configure WiFi for WPA3 with shared password
- adopt APs in the controller, observe connectivity quality
- measure speed using iperf3 and speedTest
- use ssh for server administration, use SSH keys, not passwords

For context:

- [How Secure is YOUR WiFi Network?](https://www.youtube.com/watch?v=vn_GhGMJ5lk)

### 2 weeks

Implement WPA3-Enterprise with (client-side) certificate-based WiFi authentication. More specifically, EAP-TLS.

- Migrate WiFi to use of WPA3-Enterprise with [Smallstep](https://smallstep.com/)-hosted RADIUS and Certificate Authority services
- verify that all client OSes are supported

Reading list:

- [Ultimate S-Tier Wifi Security with EAP-TLS Certificates, feat. Smallstep](https://www.youtube.com/watch?v=zD0w6SJI_Ww)
- [You shouldn’t run NSA-grade Wi-Fi at home. Here’s how to do it.](https://smallstep.com/blog/home-network-eap-tls-wifi/)
- https://www.tp-link.com/us/support/faq/3456/
- https://community.ui.com/questions/WPA2-Enterprise-with-EAP-TLS/b2766a27-36bb-40c2-8739-6bb67b3553be?reply=6
- https://std.rocks/ubiquiti_wifi_eap-tls.html

For context:

- [Journey into cryptography | Computer Science | Khan Academy](https://www.youtube.com/watch?v=Kf9KjCKmDcU&list=PL7AEDF86AABA1AA9A)
- [Encryption and public keys | Internet 101 | Computer Science | Khan Academy](https://www.youtube.com/watch?v=6-JjHa-qLPk)

### 1 month

- migrate RADIUS and Certificate Authority from smallstep-hosted to LAN-hosted architecture.
- use [open source components from smallstep](https://github.com/orgs/smallstep/repositories)

TODO:

- install/run FreeRadius in an LXC
- install/run mysql [supported version](https://github.com/fleetdm/fleet/blob/main/.github/workflows/test-go.yaml#L51) in an LXC

### Stretch

- investigate open source MDM solutions, e.g. install/run fleet in an LXC

## Abbreviations and Terminology

- WPA2-Enterprise - [Wi-Fi Protected Access 2](https://en.wikipedia.org/wiki/Wi-Fi_Protected_Access#WPA2)
- WPA3-Enterprise
- EAP-TLS - [Extensible Authentication Protocol-Transport Layer Security](https://en.wikipedia.org/wiki/Extensible_Authentication_Protocol)
- MDM - [Mobile Device Management](https://en.wikipedia.org/wiki/Mobile_device_management)

## Existing Solutions

- [micromdm](https://github.com/micromdm/micromdm/), its [backgrounder](https://micromdm.io/blog/wwdc20-v2/), [talk from 2017](https://www.youtube.com/watch?v=6DBGIDcBKFw)
- Better yet [nanomdm](https://github.com/micromdm/nanomdm), here is its [raison d\`etre](https://micromdm.io/blog/introducing-nanomdm/).
- [FleetDM](https://github.com/fleetdm/fleet), [Tutorials and Guides](https://fleetdm.com/docs/get-started/tutorials-and-guides)
